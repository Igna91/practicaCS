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
public class ItemListAdapterCalendario extends BaseAdapter {

    private Activity activity;
    private ArrayList<String []> listaPartidos;


    public ItemListAdapterCalendario(Activity activity, ArrayList<String []> list){
        this.activity = activity;
        this.listaPartidos = list;
    }



    public int getCount() {
        if(listaPartidos == null){
            return 0;
        }
        return listaPartidos.size();
    }

    public Object getItem(int position) {
        return listaPartidos.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        return  new ItemCalendario(activity, listaPartidos.get(position), position);
    }

}