package com.ps.grupo2.comunio;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
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
import android.widget.ListView;
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

public class Calendario extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Team equipo = null;
    ArrayList<Futbolista> mercadoFichajes = null;
    ArrayList<String[]> listadoPartidos = null;
    ItemListAdapterCalendario adaptadorPartidos;
    ListView listaPartidos = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Recogemos las cosas pasadas
        equipo = (Team) getIntent().getExtras().getSerializable("Equipo");
        mercadoFichajes = (ArrayList<Futbolista>) getIntent().getExtras().getSerializable("Mercado");


        listaPartidos = (ListView) findViewById(R.id.listaPartidos);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        TextView ponerNombreEquipo = (TextView) findViewById(R.id.textViewParaNombreEquipo);
        ponerNombreEquipo.setText(equipo.getNombre());

        try {
            FutureTask task = new FutureTask(new MyCallable());
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(task);
            listadoPartidos = (ArrayList<String []>) task.get();

        } catch (Exception e){
            System.out.println("Error: "+e);
        }

        adaptadorPartidos = new ItemListAdapterCalendario(this, listadoPartidos);
        listaPartidos.setAdapter(adaptadorPartidos);

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
        Intent intent;

        if (id == R.id.nav_equipo) {
            intent = new Intent(Calendario.this,GestionEquipo.class);
            intent.putExtra("Equipo", equipo);
            intent.putExtra("Mercado", mercadoFichajes);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_partidos) {
            intent = new Intent(Calendario.this,Calendario.class);
            intent.putExtra("Equipo", equipo);
            intent.putExtra("Mercado", mercadoFichajes);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_clasificacion) {
            intent = new Intent(Calendario.this,Clasificacion.class);
            intent.putExtra("Equipo", equipo);
            intent.putExtra("Mercado", mercadoFichajes);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_fichajes) {
            intent = new Intent(Calendario.this,Mercado.class);
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


    private String [] devolverPartido(JsonReader reader) {
        String nombreLocal = "", nombreVisitante="", campo ="", fecha = "";
        int golesLocales = 0, golesVisitante = 0;
        String [] partido = new String  [3];
        try{
            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                switch (name) {
                    case "nombreLocal":
                        nombreLocal = reader.nextString();
                        break;
                    case "nombreVisitante":
                        nombreVisitante = reader.nextString();
                        break;
                    case "campo":
                        campo = reader.nextString();
                        break;
                    case "fecha":
                        fecha = reader.nextString();
                        break;
                    case "golesLocales":
                        golesLocales = reader.nextInt();
                        break;
                    case "golesVisitante":
                        golesVisitante = reader.nextInt();
                        break;
                    default:
                        reader.skipValue();
                        break;
            }
        }
        reader.endObject();
        partido[0] = fecha;
        partido[1] = nombreLocal+" ("+golesLocales+")-("+golesVisitante+") "+nombreVisitante;
        partido[2] = "Estadio: "+campo;
    } catch (Exception e) {
        System.out.println(e);
    }

    return partido;
    }


    private ArrayList<String []> conexionBD() {
        HttpURLConnection cliente = null;
        URL url = null;
        ArrayList<String []> part = new ArrayList<>();

        String [] partido = new String [3];

        try {
            url = new URL("http://comuniops.esy.es/getPartidos.php");
            cliente = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(cliente.getInputStream());
            JsonReader reader = new JsonReader(new InputStreamReader(in));
            reader.beginArray();
            while (reader.hasNext()) {
                // Leer objeto
                String [] p = devolverPartido(reader);
                part.add(p);
            }
            reader.endArray();
        }catch(Exception e){
            cliente.disconnect();
        }
            return part;
    }

    private class MyCallable implements Callable<ArrayList<String []>> {


        String [] partido; //1 fecha, 2 resultado y 3 estadio
        public MyCallable(){
           partido = new String[3];
        }

        @Override
        public ArrayList<String []> call() throws Exception {
            return conexionBD();
        }

    }


}
