package com.company;

public class Defensa extends Jugador {
    public Defensa(String nombre) {
        super(nombre);
    }

    public Defensa(String nombre, Estado estado) {
        super(nombre,estado);
    }

    public void jugar(){
        System.out.println("el jugador esta defendiendo");
    }
}
