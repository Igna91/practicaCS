package com.ps.grupo2.comunio;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Josué on 23/10/2015.
 */
public class Items extends LinearLayout{

        private TextView campo1, campo2,campo3;
        private Futbolista futbolista;

        String posicion;

        public Items(Context context, Futbolista futbolista, int op, int pos, int ali) {
            super(context);
            this.futbolista = futbolista;

            if(op==1)
                rellenaPosicion(pos, ali);

            inicializar(op);

        }

    private void rellenaPosicion(int pos, int opcion){
        if(opcion == 1) {
            switch (pos + 1) {
                case 1:
                    posicion = "Portero";
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    posicion = "Defensa";
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    posicion = "Medio";
                    break;
                case 10:
                case 11:
                    posicion = "Delantero";
                    break;
            }
        }else if(opcion == 2){
            switch (pos + 1) {
                case 1:
                    posicion = "Portero";
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    posicion = "Defensa";
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    posicion = "Medio";
                    break;
                case 11:
                    posicion = "Delantero";
                    break;
            }
        }else if(opcion == 3){
            switch (pos + 1) {
                case 1:
                    posicion = "Portero";
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    posicion = "Defensa";
                    break;
                case 6:
                case 7:
                case 8:
                    posicion = "Medio";
                    break;
                case 9:
                case 10:
                case 11:
                    posicion = "Delantero";
                    break;
            }
        }

    }

        private void inicializar(int opcion){
            String infService = Context.LAYOUT_INFLATER_SERVICE;
            LayoutInflater li = (LayoutInflater)getContext().getSystemService(infService);
            li.inflate(R.layout.item_list, this, true);
            campo1 = (TextView) findViewById(R.id.NombreJugador);
            campo2 = (TextView) findViewById(R.id.PosicionJugador);
            campo1.setText(futbolista.getNombre());
            if(opcion == 1)
                campo2.setText(posicion);
            else if(opcion==2)
                campo2.setText("- "+futbolista.getPosicion()+" -");
            else
                campo2.setText("Partidos: "+futbolista.getPartidosJugados()+" - Puntuación: "+futbolista.getPuntuacion());

        }




}
