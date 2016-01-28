package com.ps.grupo2.comunio;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Josué on 23/10/2015.
 */
public class ItemListAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<Futbolista> listFutbolistas;
    private int opcion;
    private int opcion_alineacion = 0;

    public ItemListAdapter(Activity activity, ArrayList<Futbolista> listFutbolistas, int op){
        this.activity = activity;
        this.listFutbolistas = listFutbolistas;
        opcion = op;
    }


    public ItemListAdapter(Activity activity, ArrayList<Futbolista> listFutbolistas, int op, int ali){
        this.activity = activity;
        this.listFutbolistas = listFutbolistas;
        opcion = op;
        opcion_alineacion = ali;
    }



    public int getCount() {
        return listFutbolistas.size();
    }

    public Object getItem(int position) {
        return listFutbolistas.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
                  return  new Items(activity, listFutbolistas.get(position),opcion, position, opcion_alineacion);
    }

}