package com.example;

public class EnEvaluacion extends Etapa{
    public EnEvaluacion(Proyecto p){
        super(p);
    }

    @Override
    public void aprobarEtapa() {
        this.proyecto.setState(new Confirmada(this.proyecto));
    }

    @Override
    public boolean modificarMargenGanancia(double margen) {
        return (margen >= 0.11 && margen <= 0.15);
    }
}
