package com.ps.grupo2.comunio;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.JsonReader;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

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


public class GestionEquipo extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {
    private ToggleButton botonAlineacion;
    private ToggleButton botonEstadisticas;
    private ToggleButton botonSuplentes;
    private RadioGroup elegirAlineacion;
    private Button alineacion;
    ListView listaJugadores;
    ItemListAdapter adaptadorTitulares;
    ItemListAdapter adaptadorSuplentes;
    ItemListAdapter adaptadorEstadisticas;
    private Team equipo = null;
    ArrayList<Futbolista> mercadoFichajes = null;
    ArrayList<Futbolista> plantillaTotal;

    //Por ahora
    private TextView mensajePrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        equipo = (Team) getIntent().getExtras().getSerializable("Equipo");
        mercadoFichajes = (ArrayList<Futbolista>) getIntent().getExtras().getSerializable("Mercado");
        listaJugadores = (ListView) findViewById(R.id.listaJugadores);
        elegirAlineacion = (RadioGroup) findViewById(R.id.radioAlineacion);
        alineacion = (Button) findViewById(R.id.verAlineacion);

        plantillaTotal = new ArrayList<>();
        llenarEquipoTotal();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//POR AHORA
        mensajePrincipal = (TextView)findViewById(R.id.viewGestionEquipo);

        alineacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(equipo.getFutbolistas().size()== 11) {
                    Intent intent = new Intent(GestionEquipo.this, Alineacion.class);
                    intent.putExtra("equipo", equipo);
                    startActivity(intent);
                }
                else{
                    String advertencia = "Asegurate de tener 11 titulares.";
                    Toast.makeText(GestionEquipo.this, advertencia, Toast.LENGTH_SHORT).show();
                }




            }
        });
        botonAlineacion = (ToggleButton) findViewById(R.id.buttonAlin);
        botonAlineacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    alineacion.setVisibility(View.VISIBLE);
                  mostrarEquipoTitular(equipo.getAlineacion());
            }
        });
        botonEstadisticas = (ToggleButton) findViewById(R.id.buttonEst);
        botonEstadisticas.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                alineacion.setVisibility(View.INVISIBLE);
                mostrarEstadisticas();
            }
        });

        botonSuplentes = (ToggleButton) findViewById(R.id.buttonRes);
        botonSuplentes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                alineacion.setVisibility(View.INVISIBLE);
                mostrarSuplentes();
            }
        });

        mostrarEquipoTitular(equipo.getAlineacion()); //El orden importa

        TextView ponerNombreEquipo = (TextView) findViewById(R.id.textViewParaNombreEquipo);
        ponerNombreEquipo.setText(equipo.getNombre());

        listaJugadores.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ItemListAdapter la = (ItemListAdapter) parent.getAdapter();
                Futbolista fut = (Futbolista) la.getItem(position);
               /* String texto = "en condiciones óptimas";
                if (fut.isEstaLesionado())
                    texto = "lesionado";
                Toast.makeText(
                        view.getContext()
                        , fut.getNombre() + " esta " + texto
                        , Toast.LENGTH_LONG)
                        .show();*/

                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

                final Context v = view.getContext();
                final String[] items = new String[4];
                items[0] = "Estado del jugador";
               items[2] = "Poner en venta";
                items[3] = "Salir";

                if (fut.isTitular()) {
                    items[1] = "Al banquillo";
                }else{
                    items[1] = "Hacer titular";
                }



                AlertDialog dialogo = createSingleListDialog(view, items, fut);

                dialogo.show();

            }
        });

        elegirAlineacion.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup arg0, int id) {
                switch (id) {
                    case R.id.radio1:
                        equipo.setAlineacion(1);
                        mostrarEquipoTitular(1);
                        break;
                    case R.id.radio2:
                        equipo.setAlineacion(2);
                        mostrarEquipoTitular(2);
                        break;
                    case R.id.radio3:
                        equipo.setAlineacion(3);
                        mostrarEquipoTitular(3);
                        break;
                }
            }
        });


    }

    public AlertDialog createSingleListDialog(View view, final String items[], final Futbolista f) {
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

        final Context v = view.getContext();

        builder.setTitle("Observando a "+f.getNombre())
                .setItems(items, new DialogInterface.OnClickListener() {
                    int operacion = 0;

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String mensaje = "Nada";
                        switch (items[which]) {
                            case "Estado del jugador":
                                mensaje = f.getNombre() + " " + (f.isEstaLesionado() ? "Está lesionado" : "En óptimas condiciones");
                                break;
                            case "Poner en venta":
                                boolean esta = false;
                                for(Futbolista fAux : mercadoFichajes){
                                    if(f.getId() == fAux.getId())
                                        esta = true;
                                }
                                if(esta) {
                                    mensaje = f.getNombre() + " ya estaba en el mercado";
                                }else {
                                    Boolean correcto = false;
                                    try {
                                        FutureTask task = new FutureTask(new MyCallable(f, 2));
                                        ExecutorService executor = Executors.newSingleThreadExecutor();
                                        executor.submit(task);
                                        correcto = (Boolean) task.get();
                                    } catch (Exception e){
                                        System.out.println("Error: "+e);
                                    }
                                    if(correcto){
                                        mercadoFichajes.add(f);
                                        mensaje = f.getNombre() + " ahora está en el mercado";
                                    }else{
                                        mensaje = "No se pudo procesar la petición";
                                    }

                                }
                                break;
                            case "Hacer titular":
                                if(equipo.getFutbolistas().size()>= 11)
                                    mensaje = "Ya hay 11 titulares, quita a uno antes";
                                else {
                                    boolean correcto = false;
                                    try {
                                        FutureTask task = new FutureTask(new MyCallable(f, 1));
                                        ExecutorService executor = Executors.newSingleThreadExecutor();
                                        executor.submit(task);
                                        correcto = (Boolean) task.get();
                                    } catch (Exception e){
                                        System.out.println("Error: "+e);
                                    }
                                    if(correcto){
                                        Team equipo = f.getEquipo();
                                        equipo.getSuplentes().remove(f);
                                        mostrarSuplentes();
                                        equipo.agregar1Titular(f);
                                        f.setTitular(true);
                                        mensaje = f.getNombre() + " es titular ahora";
                                    }else{
                                        mensaje = "No se pudo procesar la petición";
                                    }
                                }
                                break;
                            case "Al banquillo":
                                boolean correcto = false;
                                try {
                                    FutureTask task = new FutureTask(new MyCallable(f, 1));
                                    ExecutorService executor = Executors.newSingleThreadExecutor();
                                    executor.submit(task);
                                    correcto = (Boolean) task.get();
                                } catch (Exception e){
                                    System.out.println("Error: "+e);
                                }
                                if(correcto) {
                                    Team equipo = f.getEquipo();
                                    equipo.getFutbolistas().remove(f);
                                    mostrarEquipoTitular(1);
                                    equipo.agregar1Suplente(f);
                                    f.setTitular(false);
                                    mensaje = f.getNombre() + " va al banquillo\nTienes " + f.getEquipo().getFutbolistas().size() + " titulares";
                                }else{
                                    mensaje = "No se pudo procesar la petición";
                                }
                                break;
                        }
                        if(!mensaje.equals("Nada")){
                            Toast.makeText(
                                    v,
                                    mensaje,
                                    Toast.LENGTH_SHORT)
                                    .show();
                        }
                    }

                });

        return builder.create();
    }

    private void llenarEquipoTotal(){
        for(Futbolista f: equipo.getFutbolistas())
            plantillaTotal.add(f);

        for(Futbolista f: equipo.getSuplentes())
            plantillaTotal.add(f);
    }




    private void mostrarEquipoTitular(int i){  //PRUEBA
        elegirAlineacion.setVisibility(View.VISIBLE);
        adaptadorTitulares = new ItemListAdapter(this, equipo.getFutbolistas(),1,i);
        listaJugadores.setAdapter(adaptadorTitulares);
        botonSuplentes.setTextColor(Color.parseColor("#FFFFFF"));
        botonEstadisticas.setTextColor(Color.parseColor("#FFFFFF"));
        botonAlineacion.setTextColor(Color.parseColor("#FFFF00"));
        mensajePrincipal.setVisibility(View.GONE);
        mensajePrincipal.setText("Titulares");
        adaptadorTitulares.notifyDataSetChanged();
    }

    private void mostrarEstadisticas(){
        elegirAlineacion.setVisibility(View.GONE);
        adaptadorEstadisticas = new ItemListAdapter(this, plantillaTotal,3);
        listaJugadores.setAdapter(adaptadorEstadisticas);
        botonSuplentes.setTextColor(Color.parseColor("#FFFFFF"));
        botonEstadisticas.setTextColor(Color.parseColor("#FFFF00"));
        botonAlineacion.setTextColor(Color.parseColor("#FFFFFF"));
        mensajePrincipal.setVisibility(View.VISIBLE);
        mensajePrincipal.setText("Presupuesto: " + equipo.getPresupuesto() + "€\n");
        mensajePrincipal.append("Ingresos: " + equipo.getIngresos() + "€  /  Gastos: " + equipo.getGastos() + "€");
        adaptadorEstadisticas.notifyDataSetChanged();
    }

    private void mostrarSuplentes(){
        elegirAlineacion.setVisibility(View.GONE);
        adaptadorSuplentes = new ItemListAdapter(this, equipo.getSuplentes(),2);
        listaJugadores.setAdapter(adaptadorSuplentes);
        mensajePrincipal.setText("Reservas:");
        botonSuplentes.setTextColor(Color.parseColor("#FFFF00"));
        botonEstadisticas.setTextColor(Color.parseColor("#FFFFFF"));
        botonAlineacion.setTextColor(Color.parseColor("#FFFFFF"));
        mensajePrincipal.setVisibility(View.VISIBLE);
        adaptadorSuplentes.notifyDataSetChanged();
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                System.exit(0);
                break;
            case R.id.action_settings2:
                Toast.makeText(this, "Conectado desde hace poco...", Toast.LENGTH_LONG)
                        .show();

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_equipo) {
            Intent intent = new Intent(this,GestionEquipo.class);
            intent.putExtra("Mercado", mercadoFichajes);
            intent.putExtra("Equipo", equipo);
            startActivity(intent);
        } else if (id == R.id.nav_partidos) {
            Intent intent = new Intent(this,Calendario.class);
            intent.putExtra("Mercado", mercadoFichajes);
            intent.putExtra("Equipo", equipo);
            startActivity(intent);
        } else if (id == R.id.nav_clasificacion) {
            Intent intent = new Intent(this,Clasificacion.class);
            intent.putExtra("Mercado", mercadoFichajes);
            intent.putExtra("Equipo", equipo);
            startActivity(intent);
        } else if (id == R.id.nav_fichajes) {
            Intent intent = new Intent(this,Mercado.class);
            intent.putExtra("Equipo", equipo);
            intent.putExtra("Mercado", mercadoFichajes);
            startActivity(intent);
        }  else if (id == R.id.nav_share) {
            Social.share(this, "Compartir", "Tengo "+equipo.getPuntos()+" puntos en SCRUMGOL!!!");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private boolean conexionBD(Futbolista f, int opcion) {
        HttpURLConnection cliente = null;
        URL url = null;

        int id = f.getId();
        boolean correcto = false;

        if(opcion == 1) {
            try {
                url = new URL("http://comuniops.esy.es/setTitulares.php?idJugador=" + id);
                cliente = (HttpURLConnection) url.openConnection();
                InputStream in = new BufferedInputStream(cliente.getInputStream());
                JsonReader reader = new JsonReader(new InputStreamReader(in));

                reader.beginObject();
                String name = reader.nextName();
                if (name.equals("result"))
                    correcto = reader.nextBoolean();

                reader.endObject();

            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    cliente.disconnect();
                } catch (Exception e) {

                }
            }
        }else{
            try{
                url = new URL("http://comuniops.esy.es/vendeJugador.php?idJugador=" + id);
                cliente = (HttpURLConnection) url.openConnection();
                InputStream in = new BufferedInputStream(cliente.getInputStream());
                JsonReader reader = new JsonReader(new InputStreamReader(in));

                reader.beginObject();
                String name = reader.nextName();
                if (name.equals("result"))
                    correcto = reader.nextBoolean();

                reader.endObject();

            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    cliente.disconnect();
                } catch (Exception e) {

                }
            }
        }
        return correcto;
    }

    private class MyCallable implements Callable<Boolean> {


        Futbolista f;
        int opcion;

        public MyCallable(Futbolista f, int op){
            opcion = op;
            this.f = f;
        }

        @Override
        public Boolean call() throws Exception {
            return conexionBD(this.f, opcion);
        }

    }


}
