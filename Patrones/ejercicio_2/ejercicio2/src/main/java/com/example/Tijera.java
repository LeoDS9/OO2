package com.example;

public class Tijera implements Opcion{

    
    @Override
    public String accion(Opcion opc) {
        return opc.jugarContraTijera();
    }

    @Override
    public String jugarContraTijera() {
        return "Empate";
    }

    @Override
    public String jugarContraPapel() {
        return "Tijera corta papel, gana tijera";
    }

    @Override
    public String jugarContraPiedra() {
        return "Piedra aplasta tijera, gana piedra";
    }

    @Override
    public String jugarContraSpock() {
       return "Spock rompe tijera, gana Spock";
    }

    @Override
    public String jugarContraLagarto() {
        return "Tijera decapita lagarto, gana tijera";
    }
}
