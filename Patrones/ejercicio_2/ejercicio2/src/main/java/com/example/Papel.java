package com.example;

public class Papel implements Opcion{

    
    @Override
    public String accion(Opcion opc) {
        return opc.jugarContraPapel();
    }

    @Override
    public String jugarContraTijera() {
        return "TIjera corta papel, gana tijera";
    }

    @Override
    public String jugarContraPapel() {
        return "Empate";
    }

    @Override
    public String jugarContraPiedra() {
        return "Papel cubre piedra, gana papel";
    }

    @Override
    public String jugarContraSpock() {
       return "Papel desaprueba Spock, gana papel";
    }

    @Override
    public String jugarContraLagarto() {
        return "Lagarto come papel, gana lagarto";
    }
}
