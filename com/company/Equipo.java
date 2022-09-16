package com.company;

public class Equipo {

    private final Jugador[] jugadores;
    private String nombre;

    public Equipo(String nombre, Jugador ... jugadores) {
        this.jugadores=jugadores;
        this.nombre=nombre;
    }

    public void imprimirListaDeJugadores(){
        System.out.println("La lista de jugadores de " + this.nombre + " es: ");
        for(Jugador jugador:this.jugadores){
            System.out.println(jugador);
        }
    }
    private boolean verificarQueJugadorPerteneceAEquipo(Jugador jugadorAComparar){
        boolean bandera=false;
        for(Jugador jugador:this.jugadores){
            if(jugadorAComparar==jugador){
                bandera=true;
                break;
            }
        }
        return bandera;
    }

    boolean banderaPartido=false;
    public void estaEnUnPartido() {
        banderaPartido=true;
    }

    public void cambiarJugador(Jugador jugadorEntrante, Jugador jugadorSaliente) {
        // Revisar que el equipo esta en un partido
        if (!(banderaPartido)) {
            System.out.println("El equipo no esta jugando un partido");
            return;
        }
        // Revisar que los jugadores pertenezcan al mismo equipo
        if (!(verificarQueJugadorPerteneceAEquipo(jugadorEntrante) && verificarQueJugadorPerteneceAEquipo(jugadorSaliente))) {
            System.out.println("Almenos uno de los jugadores no esta en el equipo");
            return;
        }
        // Revisar que el entrante tenga estado suplente
        if (!(jugadorEntrante.estado instanceof Suplente)) {
            System.out.println("No se puede realizar el cambio, porque " + jugadorSaliente + " no está en cancha");
            return;
        }
        // Revisar que el saliente tenga estado titular o cancha
        if (!(jugadorSaliente.estado instanceof Titular)) {
            System.out.println("No se puede realizar el cambio, porque " + jugadorSaliente + " no está en cancha");
            return;
        }
        // Hacer que el jugador entrante se ponga como estado cancha
        jugadorEntrante.estado = new Cancha();
        // Hacer que el jugador saliente se ponga como estado banca
        jugadorSaliente.estado = new Banca();
        System.out.println("Se realizó el cambio de " +jugadorSaliente + " por " + jugadorEntrante);
    }

    @Override
    public String toString() {
        return nombre;
    }


}
