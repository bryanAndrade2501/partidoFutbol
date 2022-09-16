package com.company;

public class Main {

    public static void main(String[] args) {

        Jugador messi = new Arquero("Messi");
        Jugador ronaldiño = new Delantero("Ronaldiño");
        Jugador pele = new Defensa("Oliver");
        Jugador sasuke = new Delantero("Sasuke", new Suplente());

        Jugador chavo = new Delantero("Chavo", new Suplente());
        Jugador oliver = new Delantero("Pele");
        Jugador naruto = new Defensa("Naruto");
        Jugador etesech = new Defensa("Maradona");

        //messi.jugar();
        //pele.jugar();

        Equipo aucas = new Equipo("Aucas", messi, ronaldiño, pele, sasuke);
        Equipo quito = new Equipo("Quito", oliver, naruto, etesech, chavo);

        aucas.imprimirListaDeJugadores();
        quito.imprimirListaDeJugadores();


        aucas.cambiarJugador(sasuke, ronaldiño);
        Partido partido1 = new Partido(aucas, quito);
        partido1.iniciarPartido();


    }
}
