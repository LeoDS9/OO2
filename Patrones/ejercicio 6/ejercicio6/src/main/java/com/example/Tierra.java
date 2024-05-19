package com.example;

public class Tierra extends Topografia {

    @Override
    public double proporcionAgua() {
        return 0;
    }

    @Override
    public boolean igual(Topografia topografia) {
        return topografia.igualTierra();
    }

    @Override
    public boolean igualAgua() {
        return false;
    }

    @Override
    public boolean igualTierra() {
        return true;
    }
    
    @Override
    public boolean igualPantano(){
        return false;
    }
}