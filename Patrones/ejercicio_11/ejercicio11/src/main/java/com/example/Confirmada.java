package com.example;

public class Confirmada extends Etapa{
    public Confirmada(Proyecto p){
        super(p);
    }

    @Override
    public void aprobarEtapa() {}

    @Override
    public boolean modificarMargenGanancia(double margen) {
        return false;
    }
}
