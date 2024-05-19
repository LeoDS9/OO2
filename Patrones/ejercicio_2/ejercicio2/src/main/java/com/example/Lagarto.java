package com.example;

public class Lagarto implements Opcion{

    
    @Override
    public String accion(Opcion opc) {
        return opc.jugarContraLagarto();
    }

    @Override
    public String jugarContraTijera() {
        return "Tijera decapita lagarto, gana tijera";
    }

    @Override
    public String jugarContraPapel() {
        return "Lagarto come papel, gana lagarto";
    }

    @Override
    public String jugarContraPiedra() {
        return "Piedra aplasta lagarto, gana piedra";
    }

    @Override
    public String jugarContraSpock() {
       return "Lagarto envenena Spock, gana lagarto";
    }

    @Override
    public String jugarContraLagarto() {
        return "Empate";
    }
}
