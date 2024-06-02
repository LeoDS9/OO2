package com.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
    private String nombre, objetivo;
    private LocalDate fechaIni, fechaFin;
    private int nroIntegrantes;
    private double margenGanancia, montoPagoPorIntegrantePorDia;
    private Etapa e;

    public Proyecto(String nombre, String objetivo, LocalDate fechaIni, LocalDate fechaFin, 
                    int nroIntegrantes, double montoPagoPorIntegrantePorDia) {
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.nroIntegrantes = nroIntegrantes;
        this.margenGanancia = 0.07;
        this.montoPagoPorIntegrantePorDia = montoPagoPorIntegrantePorDia;
        this.e = new EnConstruccion(this);
    }


    public void aprobarEtapa(){
        e.aprobarEtapa();
    }

    public double costo(){
        long diasProyecto = ChronoUnit.DAYS.between(fechaIni, fechaFin);
        return diasProyecto * montoPagoPorIntegrantePorDia * nroIntegrantes;
    }
    
    public double precio(){
        return costo()*margenGanancia;
    }

    public void modificarMargenGanancia(double margen){
        margenGanancia = e.modificarMargenGanancia(margen) ? margen : margenGanancia;
    }

    public void cancelar(){
        if (!objetivo.contains("(Cancelado)")) {
            objetivo += "(Cancelado)";
        }
    }

    public void setState(Etapa s){
        e = s;
    }

    public Etapa getEtapa(){
        return e;
    }
}
