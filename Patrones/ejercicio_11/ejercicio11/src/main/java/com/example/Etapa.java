package com.example;

public abstract class Etapa {
    protected Proyecto proyecto;
    
    public Etapa(Proyecto p){
        proyecto = p;
    }

    public abstract void aprobarEtapa();
    public abstract boolean modificarMargenGanancia(double margen);
}
