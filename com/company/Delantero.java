package com.company;

public class Delantero extends Jugador {
    public Delantero(String nombre) {
        super(nombre);
    }

    public Delantero(String nombre, Estado estado) {
        super(nombre,estado);
    }

    public void jugar(){
        System.out.println("el jugador esta atacando");
    }
}
