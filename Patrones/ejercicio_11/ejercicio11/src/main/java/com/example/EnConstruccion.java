package com.example;

public class EnConstruccion extends Etapa{
    
    public EnConstruccion(Proyecto p){
        super(p);
    }

    @Override
    public void aprobarEtapa() {
        if (this.proyecto.precio() != 0)
            this.proyecto.setState(new EnEvaluacion(this.proyecto));
        else
            throw new RuntimeException("La etapa no puede aprobarse debido a que el precio del proyecto es cero");
    }

    @Override
    public boolean modificarMargenGanancia(double margen) {
        return (margen >= 0.08 && margen <= 0.1);
    }

    
}
