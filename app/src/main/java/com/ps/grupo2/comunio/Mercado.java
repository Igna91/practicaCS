package com.ps.grupo2.comunio;

import android.app.AlertDialog;
import android.content.Context;
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
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Mercado extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    TextView mensaje;
    Team equipo = null;
    ArrayList<Futbolista> mercadoFichajes = null;
    ItemListAdapterFichajes adaptadorFichajes;
    ListView listadoMercado = null;
    Button botonFichaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercado);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Recogemos los parametros
        equipo = (Team) getIntent().getExtras().getSerializable("Equipo");
        mercadoFichajes = (ArrayList<Futbolista>) getIntent().getExtras().getSerializable("Mercado");
        listadoMercado = (ListView) findViewById(R.id.listaMercado);

        mostrarJugadoresMercado();


        botonFichaje = (Button) listadoMercado.findViewById(R.id.botonFichar);

        /*if(botonFichaje == null){
            Toast.makeText(
                    this
                    , "ESTA NULO EL PUTO BOTON"
                    , Toast.LENGTH_LONG)
                    .show();
        }*/

        listadoMercado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ItemListAdapterFichajes la = (ItemListAdapterFichajes) parent.getAdapter();
                Futbolista fut = (Futbolista) la.getItem(position);
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                final Context v = view.getContext();
                final String[] items = new String[3];
                items[0] = "Estado del jugador";
                items[1] = "Ojear";
                items[2] = "Salir";

                int opcion;

                AlertDialog dialogo = createSingleListDialog(view, items, fut);

                dialogo.show();

            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        TextView ponerNombreEquipo = (TextView) findViewById(R.id.textViewParaNombreEquipo);
        ponerNombreEquipo.setText(equipo.getNombre());

    }

    public ArrayList<Futbolista> getMercadoFichajes(){
        return mercadoFichajes;
    }

    public Team getEquipo(){
        return equipo;
    }

    public void mostrarJugadoresMercado(){
        adaptadorFichajes = new ItemListAdapterFichajes(this, mercadoFichajes);
        listadoMercado.setAdapter(adaptadorFichajes);
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
            intent.putExtra("Equipo", equipo);
            intent.putExtra("Mercado", mercadoFichajes);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_partidos) {
            Intent intent = new Intent(this,Calendario.class);
            intent.putExtra("Equipo", equipo);
            intent.putExtra("Mercado", mercadoFichajes);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_clasificacion) {
            Intent intent = new Intent(this,Clasificacion.class);
            intent.putExtra("Equipo", equipo);
            intent.putExtra("Mercado", mercadoFichajes);
            startActivity(intent);
            finish();
        } else if (id == R.id.nav_fichajes) {
            Intent intent = new Intent(this,Mercado.class);
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
                            case "Ojear":
                                mensaje = "Estas siguiendo a: "+f.getNombre();
                                if(f.getEquipo() != null)
                                    if(f.getEquipo().getNombre().equals(equipo.getNombre()))
                                        mensaje = f.getNombre()+" ya es de tu equipo";

                                break;
                        }
                        if (!mensaje.equals("Nada")) {
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



}
