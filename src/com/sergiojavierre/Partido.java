package com.sergiojavierre;

public class Partido {

    private final String nombre;
    private final int votos;

    public Partido(String nombre,int votos){
        this.nombre = nombre;
        this.votos = votos;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getVotos(){
        return this.votos;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "nombre='" + nombre + '\'' +
                ", votos=" + votos +
                '}';
    }
}
