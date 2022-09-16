package com.company;

public abstract class Jugador {
    private String nombre;
    protected Estado estado;

    public Jugador(String nombre) {
        this.nombre=nombre.toUpperCase();
        this.estado = new Titular();
    }

    public Jugador(String nombre, Estado estado) {
        this.nombre=nombre.toUpperCase();
        this.estado=estado;
    }

    public abstract void jugar();

    @Override
    public String toString() {
        return  nombre + "(" + estado+")";
    }

}
