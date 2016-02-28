package com.ps.grupo2.comunio;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Josué on 06/11/2015.
 */
public class ItemCalendario extends LinearLayout {

    private TextView campo1, campo2,campo3;
    private Futbolista futbolista;
    String [] partido;

    String posicion;

    public ItemCalendario(Context context,  String [] p, int pos) {
        super(context);
        this.partido = p;

        inicializar();

    }


    private void inicializar(){
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater)getContext().getSystemService(infService);
        li.inflate(R.layout.items_calendario, this, true);
        campo1 = (TextView) findViewById(R.id.fechaPartido);
        campo2 = (TextView) findViewById(R.id.resultadoPartido);
        campo3 = (TextView) findViewById(R.id.campoPartido);

        campo1.setText(partido[0]);
        campo2.setText(partido[1]);
        campo3.setText(partido[2]);

    }


}
