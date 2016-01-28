package com.ps.grupo2.comunio;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Josué on 03/11/2015.
 */
public class ItemListAdapterFichajes extends BaseAdapter {

    private Activity activity;
    private ArrayList<Futbolista> listFutbolistas;

    public ItemListAdapterFichajes(Activity activity, ArrayList<Futbolista> listFutbolistas){
        this.activity = activity;
        this.listFutbolistas = listFutbolistas;
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
        return  new ItemsFichajes(activity, listFutbolistas.get(position));
    }
}
