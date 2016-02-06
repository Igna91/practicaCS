package com.ps.grupo2.comunio;
import java.io.Serializable;
import java.util.Random;


public class Futbolista implements Serializable {
    private String nombre;
    private String posicion;
    private int puntuacion;
    private int dorsal;
    private boolean esTitular;
    private int goles;
    private boolean estaEnMercado;
    private int precio;
    private int partidosJugados;
    private boolean estaLesionado;
    private Team equipo;
    private int id;
    String nombreEquipo;
    
    //esto es un comentario de prueba
    public Futbolista(String n, String p, int punt, int partidos, int precio, boolean titular, boolean mercado, Team equipo, int id){
        nombre = n;
        posicion = p;
        dorsal = 100;
        goles = 0;
        puntuacion = punt;
        partidosJugados = partidos;
        this.precio = precio;
        esTitular = titular;
        estaEnMercado = mercado;
        this.id = id;
        if(new Random().nextFloat() > 0.85)
            estaLesionado = true;
        else
            estaLesionado = false;
        this.equipo = equipo;
        if(this.equipo != null)
            nombreEquipo = equipo.getNombre();
    }

    public void setNombreEquipo(String n){
        nombreEquipo = n;
    }

    public String getNombreEquipo(){
        return nombreEquipo;
    }

    public int getId(){
        return id;
    }

    public void setTitular(boolean tit){
        esTitular = tit;
    }

    public Team getEquipo(){
        return equipo;
    }

    public boolean isEstaLesionado(){
        return estaLesionado;
    }
    public boolean isTitular(){
        return esTitular;
    }

    public int getPuntuacion(){
        return puntuacion;
    }

    public int getPartidosJugados(){
        return partidosJugados;
    }

    public String estadisticasJugador(){
        return getNombre()+" "+getPuntuacion()+" puntos.";
    }
    public int getPrecio(){
        return precio;
    }

    public void setEquipo(Team e){
        equipo = e;
    }
    public String getNombre(){
        return nombre;
    }
    public String getPosicion(){return posicion;}
}
