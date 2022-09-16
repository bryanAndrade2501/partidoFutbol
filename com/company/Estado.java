package com.company;

public abstract class Estado {
    private String descripcion;

    public Estado(String descripcion){
        this.descripcion=descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
