package com.ps.grupo2.comunio;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.JsonReader;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;


public class ItemsFichajes extends LinearLayout {

    private TextView campo1, campo2, campo3, campo4;
    private Futbolista futbolista;

    Mercado mercado;

    public ItemsFichajes(Context context, Futbolista futbolista) {
        super(context);
        mercado = (Mercado) context;
        this.futbolista = futbolista;
        inicializar();

    }



    private void inicializar(){
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater)getContext().getSystemService(infService);
        li.inflate(R.layout.item_list_fichajes, this, true);
        Button botonFichaje = (Button) findViewById(R.id.botonFichar);
        final Boolean esMio;
        if(botonFichaje != null){
            if(futbolista.getEquipo() != null && futbolista.getEquipo().getNombre().equals(mercado.getEquipo().getNombre())){
                botonFichaje.setText("Quitar de venta");
                esMio = true;
            }else
                esMio = false;
        botonFichaje.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(esMio){
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(getContext());
                    dialogo1.setTitle("Atención");
                    int precio = (futbolista.getEquipo() == null) ? 0 : futbolista.getPrecio();
                    dialogo1.setMessage("Deseas retirar del mercado a:\n " + futbolista.getNombre());
                    dialogo1.setCancelable(true);
                    dialogo1.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            Toast.makeText(
                                    getContext()
                                    , futbolista.getNombre()+" sigue en el mercado"
                                    , Toast.LENGTH_LONG)
                                    .show();
                        }
                    });
                    dialogo1.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            String m;

                                boolean correcto = false;
                                try {
                                    FutureTask task = new FutureTask(new MyCallable(futbolista));
                                    ExecutorService executor = Executors.newSingleThreadExecutor();
                                    executor.submit(task);
                                    correcto = (Boolean) task.get();
                                } catch (Exception e){
                                    System.out.println("Error: "+e);
                                }
                                if(correcto) {
                                    m = "Has retirado del mercado a: " + futbolista.getNombre();
                                    mercado.getMercadoFichajes().remove(futbolista);
                                    mercado.mostrarJugadoresMercado();
                                }else{
                                    m = "No se pudo retirar";
                                }

                            Toast.makeText(
                                    getContext()
                                    , m
                                    , Toast.LENGTH_LONG)
                                    .show();


                        }
                    });

                    dialogo1.show();
                }else {
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(getContext());
                    dialogo1.setTitle("Atención");
                    dialogo1.setMessage("Deseas fichar a: " + futbolista.getNombre() + "\nSu precio es: " + futbolista.getPrecio()+"k€");
                    dialogo1.setCancelable(true);
                    dialogo1.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            Toast.makeText(
                                    getContext()
                                    , "No has fichado a: " + futbolista.getNombre()
                                    , Toast.LENGTH_LONG)
                                    .show();
                        }
                    });
                    dialogo1.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            String m;
                            if (futbolista.getEquipo() == null || (futbolista.getEquipo().getId() != mercado.getEquipo().getId())) {
                                boolean correcto = false;
                                try {
                                    FutureTask task = new FutureTask(new MyCallable(futbolista));
                                    ExecutorService executor = Executors.newSingleThreadExecutor();
                                    executor.submit(task);
                                    correcto = (Boolean) task.get();
                                } catch (Exception e) {
                                    System.out.println("Error: " + e);
                                }
                                if (correcto) {
                                    m = "Has fichado a: " + futbolista.getNombre();
                                    mercado.getMercadoFichajes().remove(futbolista);
                                    futbolista.setTitular(false);
                                    mercado.getEquipo().agregar1Suplente(futbolista);
                                    futbolista.setEquipo(mercado.getEquipo());
                                    mercado.mostrarJugadoresMercado();
                                } else {
                                    m = "Fondos insuficientes";
                                }
                            } else
                                m = "No puedes ficharle, ya esta en tu equipo";

                            Toast.makeText(
                                    getContext()
                                    , m
                                    , Toast.LENGTH_LONG)
                                    .show();


                        }
                    });

                    dialogo1.show();
                }
            }
        });



        }



        campo1 = (TextView) findViewById(R.id.NamePlayer);
        campo2 = (TextView) findViewById(R.id.PositionPlayer);
        campo3 = (TextView) findViewById(R.id.PricePlayer);
        campo4 = (TextView) findViewById(R.id.TeamPlayer);
        campo1.setText(futbolista.getNombre());
        campo2.setText("Posición: " + futbolista.getPosicion());
        campo3.setText("Equipo Actual: " + futbolista.getNombreEquipo());
        campo4.setText("Precio: " + futbolista.getPrecio() + "k€ ");

    }

    private boolean conexionBD(Futbolista f, int idEquipo) {
        HttpURLConnection cliente = null;
        URL url = null;

        int id = f.getId();
        boolean correcto = false;

        try {
            url = new URL("http://comuniops.esy.es/fichaJugador.php?idJugador="+f.getId()+"&idEquipo="+idEquipo);
            cliente = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(cliente.getInputStream());
            JsonReader reader = new JsonReader(new InputStreamReader(in));

            reader.beginObject();
            String name = reader.nextName();
            if(name.equals("result"))
                correcto = reader.nextBoolean();

            reader.endObject();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                cliente.disconnect();
            }catch(Exception e){

            }
        }
        return correcto;
    }

    private class MyCallable implements Callable<Boolean> {


        Futbolista f;

        public MyCallable(Futbolista f){
            this.f = f;
        }

        @Override
        public Boolean call() throws Exception {
            return conexionBD(this.f, mercado.getEquipo().getId());
        }

    }



}
