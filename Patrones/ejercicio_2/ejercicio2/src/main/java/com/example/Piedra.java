package com.example;

public class Piedra implements Opcion{

    
    @Override
    public String accion(Opcion opc) {
        return opc.jugarContraPiedra();
    }

    @Override
    public String jugarContraTijera() {
        return "Piedra aplasta tijera, gana piedra";
    }

    @Override
    public String jugarContraPapel() {
        return "Papel cubre piedra, gana papel";
    }

    @Override
    public String jugarContraPiedra() {
        return "Empate";
    }

    @Override
    public String jugarContraSpock() {
       return "Spock vaporiza piedra, gana Spock";
    }

    @Override
    public String jugarContraLagarto() {
        return "Piedra aplasta lagarto, gana piedra";
    }
}
