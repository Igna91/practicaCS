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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Clasificacion extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Team equipo = null;
    ArrayList<Futbolista> mercadoFichajes = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasificacion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Recogemos los parametros
        equipo = (Team) getIntent().getExtras().getSerializable("Equipo");
        mercadoFichajes = (ArrayList<Futbolista>) getIntent().getExtras().getSerializable("Mercado");

        TextView mensajeClasificacion = (TextView) findViewById(R.id.mensajeClasificacion);
        mensajeClasificacion.setText("1º - "+equipo.getNombre()+" "+equipo.getPuntos()+" puntos.");

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
                finish();
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
        } else if (id == R.id.nav_share ) {
            Social.share(this, "Compartir", "Tengo "+equipo.getPuntos()+" puntos en SCRUMGOL!!!");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
