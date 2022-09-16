package com.company;

public class Arquero extends Jugador {
    public Arquero(String nombre) {
        super(nombre);
    }

    public Arquero(String nombre, Estado estado) {
        super(nombre,estado);
    }

    public void jugar(){
        System.out.println("jugador esta tapando");
    }
}
