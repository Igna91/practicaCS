package com.ps.grupo2.comunio;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

public class splashScreen extends AppCompatActivity {
    public static final int segundos=3;
    public static final int milisegundos=3000;
    public static final int delay=1;
    private ProgressBar progreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        progreso=(ProgressBar)findViewById(R.id.progressBar);
        progreso.setMax(maximoProgreso());
        empezarAnimacion();
    }

    public int maximoProgreso(){
        return segundos-delay;
    }

    public void empezarAnimacion(){
        new CountDownTimer(milisegundos,500){

            @Override
            public void onTick(long millisUntilFinished) {
                progreso.setProgress(establecer_progreso(millisUntilFinished));
            }

            @Override
            public void onFinish() {
                Intent saltarA=new Intent(splashScreen.this,MainActivity.class);
                startActivity(saltarA);
                finish();
            }
        }.start();

    }

    public int establecer_progreso(long miliseconds){
        return (int)((milisegundos-miliseconds)/500);
    }

}
