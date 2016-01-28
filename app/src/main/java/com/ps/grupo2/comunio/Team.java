package com.ps.grupo2.comunio;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Josué on 08/10/2015.
 */
public class Team implements Serializable {
    protected ArrayList<Futbolista> futbolistas;
    protected ArrayList<Futbolista> suplentes;
    private String nombre;
    private int gastos;
    private int ingresos;
    private int presupuesto;
    int puntos;
    int alineacion = 1;
    int id;

    public Team(String n, int ing, int gast, int id){
        nombre = n;
        ingresos = ing;
        gastos = gast;
        presupuesto = new Random().nextInt(200000)+90000;
        puntos = new Random().nextInt(90)+9;
        this.id = id;
    }

    public void setAlineacion(int a){
        alineacion = a;
    }

    public int getAlineacion(){
        return alineacion;
    }


    public void agregarFutbolistas(ArrayList<Futbolista> f){
        futbolistas = f;
    }

    public int getId(){
        return id;
    }

    public void agregarSuplentes(ArrayList<Futbolista> s){
        suplentes = s;
    }

    public String getNombre(){
        return nombre;
    }

    public int getIngresos(){
        return ingresos;
    }

    public int getGastos(){
        return gastos;
    }


    public int getPresupuesto(){
        return presupuesto;
    }

    public int getPuntos(){
        return puntos;
    }
    public void agregar1Titular(Futbolista f){
        futbolistas.add(f);
    }
    public void agregar1Suplente(Futbolista f){
        suplentes.add(f);
    }
    public void eliminarFutbolista(Futbolista f, int op){
        if(op==1)
            futbolistas.remove(f);
        else if(op==2)
            suplentes.remove(f);
    }

    public ArrayList<Futbolista> getFutbolistas(){
        return futbolistas;
    }

    public ArrayList<Futbolista> getSuplentes(){
        return suplentes;
    }
}
