package com.ps.grupo2.comunio;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.JsonReader;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Registro extends AppCompatActivity {

    Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botonEnviar = (Button) findViewById(R.id.botonEnviarRegistro);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean Correcto = false;
                //Creado un hilo para la conexión

                try {
                    FutureTask task = new FutureTask(new MyCallable());
                    ExecutorService executor = Executors.newSingleThreadExecutor();

                    executor.submit(task);

                    Correcto = (Boolean) task.get();
                } catch (Exception e){
                    System.out.println("Error: "+e);
                }
                if (Correcto) {
                    String mensaje = "Registro correcto\nRevisa tu email";
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Registro.this);
                    dialogo1.setTitle("OK");
                    dialogo1.setMessage(mensaje);
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Reintentar", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            Intent intent = new Intent(Registro.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });

                    dialogo1.show();

                } else {
                    String mensaje = "No se pudo realizar el registro";

                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Registro.this);
                    dialogo1.setTitle("ERROR");
                    dialogo1.setMessage(mensaje);
                    dialogo1.setPositiveButton("Reintentar", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            Intent intent = new Intent(Registro.this, Registro.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    dialogo1.setNegativeButton("Salir", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            Intent intent = new Intent(Registro.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    dialogo1.show();

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
                Toast.makeText(this, "Conexión nula...", Toast.LENGTH_LONG)
                        .show();

                break;
        }
        return super.onOptionsItemSelected(item);
    }


    private Boolean conexionBD(String user, String pass1, String pass2, String mail) {
        HttpURLConnection cliente = null;
        URL url = null;

       Boolean Correcto = false;


        try {
            url = new URL("http://comuniops.esy.es/registro.php?nick="+user+"&pass1="+pass1+"&pass2="+pass2+"&correo="+mail);
            cliente = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(cliente.getInputStream());
            JsonReader reader = new JsonReader(new InputStreamReader(in));

            reader.beginObject();
            String name = reader.nextName();
            if(name.equals("register"))
                Correcto = reader.nextBoolean();

            reader.endObject();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                cliente.disconnect();
            }catch(Exception e){

            }
        }
        return Correcto;
    }

    //Clase para ejecutar la conexion a BD
    private class MyCallable implements Callable<Boolean> {

        @Override
        public Boolean call() throws Exception {
            EditText usuario = (EditText) findViewById(R.id.nick);
            String nick = usuario.getText().toString();
            EditText p = (EditText) findViewById(R.id.password1);
            String pass1 = p.getText().toString();
            p = (EditText) findViewById(R.id.password2);
            String pass2 = p.getText().toString();
            EditText mail = (EditText) findViewById(R.id.mail);
            String email = mail.getText().toString();
            if(!pass1.equals(pass2) || (!(email.contains("@") && (email.contains(".")))))
                return false; //noCorrecto!!

            return conexionBD(nick, pass1, pass2 , email);

        }

    }

}
