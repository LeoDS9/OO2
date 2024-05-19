package com.example;

public class Pantano extends Topografia {

    @Override
    public double proporcionAgua() {
        return 0.7;
    }

    @Override
    public boolean igual(Topografia topografia) {
        return topografia.igualPantano();
    }

    @Override
    public boolean igualAgua() {
        return false;
    }

    @Override
    public boolean igualTierra() {
        return false;
    }
    
    @Override
    public boolean igualPantano(){
        return true;
    }
}
