package com.example;

public class Agua extends Topografia {

    @Override
    public double proporcionAgua() {
        return 1;
    }

    @Override
    public boolean igual(Topografia topografia) {
        return topografia.igualAgua();
    }

    @Override
    public boolean igualAgua() {
        return true;
    }

    @Override
    public boolean igualTierra() {
        return false;
    }
    
    @Override
    public boolean igualPantano(){
        return false;
    }
}
