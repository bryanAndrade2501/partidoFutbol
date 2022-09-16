package com.company;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int marcadorEq1;
    private int marcadorEq2;


    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1=equipo1;
        this.equipo2=equipo2;
    }

    public void iniciarPartido(){
        equipo1.estaEnUnPartido();
        equipo2.estaEnUnPartido();
        System.out.println("El partido empezo entre "+ equipo1 + " y "+equipo2);
        for(int i=0;i<20;i++) {
            int intentoDeMarcar= (int) (Math.random()*100);
            if(intentoDeMarcar>75){
                if(i % 2 == 0){
                    marcadorEq1+=1;
                    System.out.println("El equipo "+equipo1+" marco un gol");
                }else{
                    marcadorEq2+=1;
                    System.out.println("El equipo "+equipo2+" marco un gol");
                }
                System.out.println(equipo1+": "+marcadorEq1+" - "+equipo2+": "+marcadorEq2);
            }
        }
    }

}
