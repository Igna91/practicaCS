package com.ps.grupo2.comunio;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;



public class Alineacion extends AppCompatActivity {
    Button aux,delantero1,delantero2,delantero3,delantero4,medio1,medio2,medio3,medio4,medio5,defensa1,defensa2,defensa3,defensa4,portero;

    RelativeLayout contentDelanteros,contentMedios,contentDefensas,contentPortero;
    Team equipo = null;
    RelativeLayout.LayoutParams     l1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT),
            l2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT),
            l3 =  new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT),
            l4 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT),
            l5 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT),
            l6 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT),
            l7 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT),
            l8 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT),
            l9 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT),
            l10 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT),
            l11 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alineacion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        contentDelanteros = (RelativeLayout)findViewById(R.id.relativeLayout);
        contentMedios = (RelativeLayout)findViewById(R.id.relativeLayout2);
        contentDefensas = (RelativeLayout)findViewById(R.id.relativeLayout3);
        contentPortero = (RelativeLayout)findViewById(R.id.relativeLayout4);


        equipo = (Team) getIntent().getExtras().getSerializable("equipo");
        if(equipo != null){
            switch(equipo.getAlineacion()){
                case 1:
                    alineacion1();
                    break;
                case 2: alineacion2();
                    break;
                case 3: alineacion3();
                    break;
            }

        }
    }




    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void alineacion3(){

        delantero1 = new Button(this);
        delantero2 = new Button(this);
        delantero3 = new Button(this);
        medio1 = new Button(this);
        medio2 = new Button(this);
        medio3 = new Button(this);
        defensa1 = new Button(this);
        defensa2 = new Button(this);
        defensa3 = new Button(this);
        defensa4 = new Button(this);
        portero = new Button(this);

        delantero1.setId(R.id.delantero1);
        delantero2.setId(R.id.delantero2);
        delantero3.setId(R.id.delantero3);
        medio1.setId(R.id.medio1);
        medio2.setId(R.id.medio2);
        medio3.setId(R.id.medio3);
        defensa1.setId(R.id.defensa1);
        defensa2.setId(R.id.defensa2);
        defensa3.setId(R.id.defensa3);
        defensa4.setId(R.id.defensa1);
        portero.setId(R.id.portero);

        delantero1.setText(equipo.getFutbolistas().get(10).getNombre());
        delantero2.setText(equipo.getFutbolistas().get(9).getNombre());
        delantero3.setText(equipo.getFutbolistas().get(8).getNombre());
        medio1.setText(equipo.getFutbolistas().get(7).getNombre());
        medio2.setText(equipo.getFutbolistas().get(6).getNombre());
        medio3.setText(equipo.getFutbolistas().get(5).getNombre());
        defensa1.setText(equipo.getFutbolistas().get(4).getNombre());
        defensa2.setText(equipo.getFutbolistas().get(3).getNombre());
        defensa3.setText(equipo.getFutbolistas().get(2).getNombre());
        defensa4.setText(equipo.getFutbolistas().get(1).getNombre());
        portero.setText(equipo.getFutbolistas().get(0).getNombre());


        l1.addRule(RelativeLayout.ALIGN_PARENT_LEFT);

        l2.addRule(RelativeLayout.CENTER_IN_PARENT);

        l3.addRule(RelativeLayout.ALIGN_PARENT_END);

        l4.addRule(RelativeLayout.ALIGN_PARENT_LEFT);

        l5.addRule(RelativeLayout.CENTER_IN_PARENT);


        l6.addRule(RelativeLayout.ALIGN_PARENT_END);

        l7.addRule(RelativeLayout.ALIGN_PARENT_START);
        l7.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        l7.addRule(RelativeLayout.ALIGN_PARENT_LEFT);

        l8.setMargins(300, 170, 0, 0);

        l9.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        l9.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        l9.addRule(RelativeLayout.ALIGN_PARENT_END);

        l10.addRule(RelativeLayout.ALIGN_TOP, defensa2.getId());
        l10.addRule(RelativeLayout.RIGHT_OF, defensa2.getId());
        l10.addRule(RelativeLayout.END_OF, defensa2.getId());


        l11.addRule(RelativeLayout.CENTER_IN_PARENT);

        delantero1.setLayoutParams(l1);
        delantero2.setLayoutParams(l2);
        delantero3.setLayoutParams(l3);
        medio1.setLayoutParams(l4);
        medio2.setLayoutParams(l5);
        medio3.setLayoutParams(l6);
        defensa1.setLayoutParams(l7);
        defensa2.setLayoutParams(l8);
        defensa3.setLayoutParams(l9);
        defensa4.setLayoutParams(l10);
        portero.setLayoutParams(l11);

        contentDelanteros.addView(delantero1);
        contentDelanteros.addView(delantero2);
        contentDelanteros.addView(delantero3);
        contentMedios.addView(medio1);
        contentMedios.addView(medio2);
        contentMedios.addView(medio3);
        contentDefensas.addView(defensa1);
        contentDefensas.addView(defensa2);
        contentDefensas.addView(defensa3);
        contentDefensas.addView(defensa4);
        contentPortero.addView(portero);

    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void alineacion2(){
        delantero1 = new Button(this);
        medio1 = new Button(this);
        medio2 = new Button(this);
        medio3 = new Button(this);
        medio4 = new Button(this);
        medio5 = new Button(this);
        defensa1 = new Button(this);
        defensa2 = new Button(this);
        defensa3 = new Button(this);
        defensa4 = new Button(this);
        portero = new Button(this);

        delantero1.setId(R.id.delantero1);
        medio1.setId(R.id.medio1);
        medio2.setId(R.id.medio2);
        medio3.setId(R.id.medio3);
        medio4.setId(R.id.medio4);
        medio5.setId(R.id.medio5);
        defensa1.setId(R.id.defensa1);
        defensa2.setId(R.id.defensa2);
        defensa3.setId(R.id.defensa3);
        defensa4.setId(R.id.defensa1);
        portero.setId(R.id.portero);

        delantero1.setText(equipo.getFutbolistas().get(10).getNombre());
        medio1.setText(equipo.getFutbolistas().get(9).getNombre());
        medio2.setText(equipo.getFutbolistas().get(8).getNombre());
        medio3.setText(equipo.getFutbolistas().get(7).getNombre());
        medio4.setText(equipo.getFutbolistas().get(6).getNombre());
        medio5.setText(equipo.getFutbolistas().get(5).getNombre());
        defensa1.setText(equipo.getFutbolistas().get(4).getNombre());
        defensa2.setText(equipo.getFutbolistas().get(3).getNombre());
        defensa3.setText(equipo.getFutbolistas().get(2).getNombre());
        defensa4.setText(equipo.getFutbolistas().get(1).getNombre());
        portero.setText(equipo.getFutbolistas().get(0).getNombre());


        l1.addRule(RelativeLayout.CENTER_IN_PARENT);

        l2.addRule(RelativeLayout.ALIGN_PARENT_START);

        l3.addRule(RelativeLayout.BELOW, medio4.getId());
        l3.addRule(RelativeLayout.CENTER_HORIZONTAL);

        l4.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        l4.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        l4.addRule(RelativeLayout.ALIGN_PARENT_END);

        // l7.addRule(RelativeLayout.ABOVE, medio2.getId());
        l5.addRule(RelativeLayout.CENTER_VERTICAL);
        // l7.addRule(RelativeLayout.ALIGN_RIGHT, medio2.getId());
        l5.addRule(RelativeLayout.ALIGN_END, medio2.getId());
        /*l7.setMargins(0, 0, 58, 0);*/
        l5.setMarginEnd(200);

        l6.addRule(RelativeLayout.CENTER_VERTICAL);
        l6.addRule(RelativeLayout.ALIGN_START, medio2.getId());
       /* l8.addRule(RelativeLayout.ABOVE, medio2.getId());
        l8.addRule(RelativeLayout.ALIGN_RIGHT, medio3.getId());
        l8.addRule(RelativeLayout.ALIGN_END, medio3.getId());*/
        l6.setMarginStart(200);

        l7.addRule(RelativeLayout.ALIGN_PARENT_START);
        l7.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        l7.addRule(RelativeLayout.ALIGN_PARENT_LEFT);

        l8.setMargins(300, 170, 0, 0);

        l9.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        l9.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        l9.addRule(RelativeLayout.ALIGN_PARENT_END);

        l10.addRule(RelativeLayout.ALIGN_TOP, defensa2.getId());
        l10.addRule(RelativeLayout.RIGHT_OF,defensa2.getId());
        l10.addRule(RelativeLayout.END_OF, defensa2.getId());

        l11.addRule(RelativeLayout.CENTER_IN_PARENT);

        delantero1.setLayoutParams(l1);
        medio1.setLayoutParams(l2);
        medio2.setLayoutParams(l3);
        medio3.setLayoutParams(l4);
        medio4.setLayoutParams(l5);
        medio5.setLayoutParams(l6);
        defensa1.setLayoutParams(l7);
        defensa2.setLayoutParams(l8);
        defensa3.setLayoutParams(l9);
        defensa4.setLayoutParams(l10);
        portero.setLayoutParams(l11);

        contentDelanteros.addView(delantero1);
        contentMedios.addView(medio1);
        contentMedios.addView(medio2);
        contentMedios.addView(medio3);
        contentMedios.addView(medio4);
        contentMedios.addView(medio5);
        contentDefensas.addView(defensa1);
        contentDefensas.addView(defensa2);
        contentDefensas.addView(defensa3);
        contentDefensas.addView(defensa4);
        contentPortero.addView(portero);
    }

    public void alineacion1(){
        delantero1 = new Button(this);
        delantero2 = new Button(this);
        medio1 = new Button(this);
        medio2 = new Button(this);
        medio3 = new Button(this);
        medio4 = new Button(this);
        defensa1 = new Button(this);
        defensa2 = new Button(this);
        defensa3 = new Button(this);
        defensa4 = new Button(this);
        portero = new Button(this);

        delantero1.setId(R.id.delantero1);
        delantero2.setId(R.id.delantero2);;
        medio1.setId(R.id.medio1);
        medio2.setId(R.id.medio2);
        medio3.setId(R.id.medio3);
        medio4.setId(R.id.medio4);
        defensa1.setId(R.id.defensa1);
        defensa2.setId(R.id.defensa2);
        defensa3.setId(R.id.defensa3);
        defensa4.setId(R.id.defensa1);
        portero.setId(R.id.portero);

        delantero1.setText(equipo.getFutbolistas().get(10).getNombre());
        delantero2.setText(equipo.getFutbolistas().get(9).getNombre());
        medio1.setText(equipo.getFutbolistas().get(8).getNombre());
        medio2.setText(equipo.getFutbolistas().get(7).getNombre());
        medio3.setText(equipo.getFutbolistas().get(6).getNombre());
        medio4.setText(equipo.getFutbolistas().get(5).getNombre());
        defensa1.setText(equipo.getFutbolistas().get(4).getNombre());
        defensa2.setText(equipo.getFutbolistas().get(3).getNombre());
        defensa3.setText(equipo.getFutbolistas().get(2).getNombre());
        defensa4.setText(equipo.getFutbolistas().get(1).getNombre());
        portero.setText(equipo.getFutbolistas().get(0).getNombre());

        l1.addRule(RelativeLayout.ALIGN_PARENT_LEFT);

        l2.addRule(RelativeLayout.ALIGN_PARENT_END);

        l3.addRule(RelativeLayout.ALIGN_PARENT_START);
        l3.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        l3.addRule(RelativeLayout.ALIGN_PARENT_LEFT);

        l4.setMargins(300, 170, 0, 0);

        l5.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        l5.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        l5.addRule(RelativeLayout.ALIGN_PARENT_END);

        l6.addRule(RelativeLayout.ALIGN_TOP, medio2.getId());
        l6.addRule(RelativeLayout.RIGHT_OF,medio2.getId());
        l6.addRule(RelativeLayout.END_OF, medio2.getId());

        l7.addRule(RelativeLayout.ALIGN_PARENT_START);
        l7.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        l7.addRule(RelativeLayout.ALIGN_PARENT_LEFT);

        l8.setMargins(300, 170, 0, 0);

        l9.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        l9.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        l9.addRule(RelativeLayout.ALIGN_PARENT_END);

        l10.addRule(RelativeLayout.ALIGN_TOP, defensa2.getId());
        l10.addRule(RelativeLayout.RIGHT_OF,defensa2.getId());
        l10.addRule(RelativeLayout.END_OF, defensa2.getId());

        l11.addRule(RelativeLayout.CENTER_IN_PARENT);

        delantero1.setLayoutParams(l1);
        delantero2.setLayoutParams(l2);
        medio1.setLayoutParams(l3);
        medio2.setLayoutParams(l4);
        medio3.setLayoutParams(l5);
        medio4.setLayoutParams(l6);
        defensa1.setLayoutParams(l7);
        defensa2.setLayoutParams(l8);
        defensa3.setLayoutParams(l9);
        defensa4.setLayoutParams(l10);
        portero.setLayoutParams(l11);

        contentDelanteros.addView(delantero1);
        contentDelanteros.addView(delantero2);
        contentMedios.addView(medio1);
        contentMedios.addView(medio2);
        contentMedios.addView(medio3);
        contentMedios.addView(medio4);
        contentDefensas.addView(defensa1);
        contentDefensas.addView(defensa2);
        contentDefensas.addView(defensa3);
        contentDefensas.addView(defensa4);
        contentPortero.addView(portero);

    }
}
