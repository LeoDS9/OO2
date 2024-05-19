package com.example;

public class Spock implements Opcion{

    
    @Override
    public String accion(Opcion opc) {
        return opc.jugarContraSpock();
    }

    @Override
    public String jugarContraTijera() {
        return "Spock rompe tijera, gana Spock";
    }

    @Override
    public String jugarContraPapel() {
        return "Papel desaprueba Spock, gana papel";
    }

    @Override
    public String jugarContraPiedra() {
        return "Spock vaporiza piedra, gana Spock";
    }

    @Override
    public String jugarContraSpock() {
       return "Empate";
    }

    @Override
    public String jugarContraLagarto() {
        return "Lagarto envenena Spock, gana lagarto";
    }
}
