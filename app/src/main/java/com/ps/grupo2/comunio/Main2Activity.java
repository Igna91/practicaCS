package com.ps.grupo2.comunio;


import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.JsonReader;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    int id;
    Team equipo = null;
    ArrayList<Futbolista> mercadoFichajes = null;
    Button botonSorteo;
    TextView textoSorteo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Recogemos la id del usuario
        Bundle bundle = getIntent().getExtras();
        id = bundle.getInt("id");
        mercadoFichajes = new ArrayList<>();
        botonSorteo = (Button) findViewById(R.id.buttonSorteo);
        textoSorteo = (TextView) findViewById(R.id.textoSorteo);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        try {
            FutureTask task = new FutureTask(new MyCallable());
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(task);
            equipo = (Team) task.get();
        } catch (Exception e){
            System.out.println("Error: "+e);
        }

        TextView ponerNombreEquipo = (TextView) findViewById(R.id.textViewParaNombreEquipo);
        ponerNombreEquipo.setText(equipo.getNombre());
        textoSorteo.setText("Bienvenido\n" + equipo.getNombre() + " te echaban de menos\n");
        textoSorteo.append("Gana dinero para tu equipo pulsando el botón ;)\n");
        textoSorteo.append("Es tu oportunidad\n\n");
        textoSorteo.append(new Date().toString());

        botonSorteo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random number;
                try{
                     number = SecureRandom.getInstance("Scrumgol");
                }catch(Exception e){
                     number = new Random();
                }

                int n = number.nextInt(10)+1;
                String mensajeSorteo = "No has tenido suerte";
                switch (n){
                    case 1:
                    case 2:
                    case 3:
                        mensajeSorteo = "Has ganado 1000€";
                        break;
                    case 7:
                    case 8:
                        mensajeSorteo = "Has ganado 5000€";
                        break;
                    case 9:
                        mensajeSorteo = "¡Fantástico!\nHas ganado 10000€";
                        break;
                    case 10:
                        mensajeSorteo = "¡Máximo preimo!\nHas ganado 15000€";
                        break;
                }

                AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Main2Activity.this);
                dialogo1.setTitle("Resultado del sorteo: "+n);
                dialogo1.setMessage(mensajeSorteo);
                dialogo1.setCancelable(false);
                dialogo1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        Intent intent = new Intent(Main2Activity.this,GestionEquipo.class);
                        intent.putExtra("Equipo", equipo);
                        intent.putExtra("Mercado", mercadoFichajes);
                        startActivity(intent);
                        finish();
                    }
                });
                dialogo1.show();

            }



        });
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



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent;

        if (id == R.id.nav_equipo) {
            intent = new Intent(Main2Activity.this,GestionEquipo.class);
            intent.putExtra("Equipo", equipo);
            intent.putExtra("Mercado", mercadoFichajes);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_partidos) {
            intent = new Intent(Main2Activity.this,Calendario.class);
            intent.putExtra("Equipo", equipo);
            intent.putExtra("Mercado", mercadoFichajes);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_clasificacion) {
            intent = new Intent(Main2Activity.this,Clasificacion.class);
            intent.putExtra("Equipo", equipo);
            intent.putExtra("Mercado", mercadoFichajes);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_fichajes) {
            intent = new Intent(Main2Activity.this,Mercado.class);
            intent.putExtra("Equipo", equipo);
            intent.putExtra("Mercado", mercadoFichajes);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_share) {
            Social.share(this, "Compartir", "Tengo "+equipo.getPuntos()+" puntos en SCRUMGOL!!!");
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                System.exit(0);
                break;
            case R.id.action_settings2:
                Toast.makeText(this, "Te acabas de conectar...", Toast.LENGTH_LONG)
                        .show();

                break;
        }
        return super.onOptionsItemSelected(item);
    }






    private Team conexionBD(int id) {
        HttpURLConnection cliente = null;
        URL url = null;
        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        ArrayList<Futbolista> suplentes = new ArrayList<>();
        Team equipo2 = null;

        //RELLENAR EQUIPO
        try {
            url = new URL("http://comuniops.esy.es/getEquipo.php?idUsuario="+id);
            cliente = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(cliente.getInputStream());
            JsonReader reader = new JsonReader(new InputStreamReader(in));
            equipo2 = leerEquipo(reader);
            url = new URL("http://comuniops.esy.es/getJugadores.php?idEquipo="+id);
            cliente = (HttpURLConnection) url.openConnection();
            in = new BufferedInputStream(cliente.getInputStream());
            reader = new JsonReader(new InputStreamReader(in));
            reader.beginArray();
            while (reader.hasNext()) {
                // Leer objeto
                Futbolista f = devolverFutbolista(reader, equipo2);
                if(f.isTitular())
                    futbolistas.add(f);
                else
                    suplentes.add(f);
            }
            reader.endArray();
         //   equipo2.agregarFutbolistas(futbolistas);
           // equipo2.agregarSuplentes(suplentes);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                cliente.disconnect();
            }catch(Exception e){

            }
        }

        //COMPROBAR FICHAJES
        try {
            url = new URL("http://comuniops.esy.es/getJugadoresLibres.php");
            cliente = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(cliente.getInputStream());
            JsonReader reader = new JsonReader(new InputStreamReader(in));
            reader.beginArray();
            while (reader.hasNext()) {
                // Leer objeto
                Futbolista f = devolverFutbolista(reader, equipo2);
                mercadoFichajes.add(f);
            }
            reader.endArray();


        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                cliente.disconnect();
            }catch(Exception e){

            }
        }

        equipo2.agregarFutbolistas(futbolistas);
        equipo2.agregarSuplentes(suplentes);

        return equipo2;
    }


    private Team leerEquipo(JsonReader reader) {
        String nombre = "Prueba";
        int ingresos = 0;
        int gastos = 0;
        int idE = 0;
        try {
            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                switch (name) {
                    case "nombre":
                        nombre = reader.nextString();
                        break;
                    case "ingresos":
                        ingresos = reader.nextInt();
                        break;
                    case "gastos":
                        gastos = reader.nextInt();
                        break;
                    case "id":
                        idE = reader.nextInt();
                        break;
                    default:
                        reader.skipValue();
                        break;
                }
            }
            reader.endObject();
        }catch(Exception e){

        }
        return new Team(nombre, ingresos, gastos, id);
    }

    private Futbolista devolverFutbolista(JsonReader reader, Team equipo) {
        String nombre = "Prueba";
        String posicion = "DEF";
        int puntos = 0;
        int partidos = 0;
        int precio = 1;
        int titular = 0;
        int id = 0;
        int idEquipo = -1;
        Team t = null;
        String nombreEquipo = "";
        boolean esTitular = true;
        boolean estaMercado = false;
        try {
            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                switch (name) {
                    case "nombre":
                        nombre = reader.nextString();
                        break;
                    case "puntos":
                        puntos = reader.nextInt();
                        break;
                    case "posicion":
                        posicion = reader.nextString();
                        break;
                    case "precio":
                        precio = reader.nextInt();
                        break;
                    case "partidosJugados":
                        partidos = reader.nextInt();
                        break;
                    case "id":
                        id = reader.nextInt();
                        break;
                    case "titular":
                        titular = reader.nextInt();
                        if(titular == 0)
                            esTitular = true;
                        else
                            esTitular = false;
                        break;
                    case "nombreEquipo":
                        nombreEquipo = reader.nextString();
                        break;
                    case "idEquipo":
                        idEquipo = reader.nextInt();
                        break;
                    default:
                        reader.skipValue();
                        break;
                }
            }
            reader.endObject();
        }catch(Exception e){

        }
        if(this.id == idEquipo){
            t = equipo;
        }
        Futbolista Fut = new Futbolista(nombre, posicion, puntos, partidos, precio, esTitular, estaMercado, t, id);
        if(nombreEquipo.equals("")) {
            if(new Random().nextFloat() < 0.6)
                nombreEquipo = "Urjc";
            else
                nombreEquipo = "Upm";
        }
        Fut.setNombreEquipo(nombreEquipo);
        return Fut;
    }



    //Esto es para devolver el equipo
    private class MyCallable implements Callable<Team> {

        @Override

        public Team call() throws Exception {
            return conexionBD(id);
        }

    }
}
