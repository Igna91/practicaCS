package com.ps.grupo2.comunio;


import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.JsonReader;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;


public class MainActivity extends AppCompatActivity {


    Button botonEntrar;
    Button botonRegistro;
    ProgressDialog  pd ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botonRegistro = (Button) findViewById(R.id.botonRegistrar);
        botonEntrar = (Button) findViewById(R.id.botonEntrar);
        botonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Registro.class)); //No cerramos esa activity para volver en caso de salir
            }
        });

        botonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int id = -99;
                //Creado un hilo para la conexión

                try {
                    FutureTask task = new FutureTask(new MyCallable());
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    pd = ProgressDialog.show(MainActivity.this, "Procesando", "Espere unos segundos...", true, false);

                    executor.submit(task);

                    id = (Integer) task.get();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
                if (id > 0) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("id", id); //pasar argumento a otra activity

                    if (pd != null) {
                        pd.dismiss();
                    }

                    startActivity(intent);
                    finish();
                } else {
                    String mensaje = "Usuario o contraseña incorrecta";
                    if (id == -99) { //Por si no puede conectarse a internet
                        mensaje = "No hay conexión a internet";
                    }
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(MainActivity.this);
                    dialogo1.setTitle("ERROR");
                    dialogo1.setMessage(mensaje);
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            //finish();  //Esto para que se salga
                        }
                    });
                    dialogo1.show();
                    if (pd != null) {
                        pd.dismiss();
                    }
                }
            }
        });
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
                Toast.makeText(this, "Aún no te has conectado...", Toast.LENGTH_LONG)
                        .show();

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public static int conexionBD(String user, String pass) {
        HttpURLConnection cliente = null;
        URL url = null;

        int id = -1;


        try {
            url = new URL("http://comuniops.esy.es/login.php?nick="+user+"&pass="+pass);
            cliente = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(cliente.getInputStream());
            JsonReader reader = new JsonReader(new InputStreamReader(in));

            reader.beginObject();
            String name = reader.nextName();
            if(name.equals("id"))
                id = reader.nextInt();

            reader.endObject();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                cliente.disconnect();
            }catch(Exception e){

            }
        }
        return id;
    }

    public static boolean loginAccess(String user, String pass){
        return ((user != null)&&(!user.equals(""))&&
                (pass != null)&&(!pass.equals(""))) ? true : false;
    }

    //Clase para ejecutar la conexion a BD
    public class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            EditText usuario = (EditText) findViewById(R.id.user);
            String nombre = usuario.getText().toString();
            EditText p = (EditText) findViewById(R.id.password);
            String pass = p.getText().toString();
            return conexionBD(nombre, pass);

        }



    }


}


