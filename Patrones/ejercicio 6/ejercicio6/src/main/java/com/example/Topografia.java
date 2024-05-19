package com.example;

public abstract class Topografia {
    public boolean igualMixta(Mixta mixta){
        return false;
    }
    public double proporcionTierra(){
        return (1 - this.proporcionAgua());
    }
    public abstract double proporcionAgua();
    public abstract boolean igual(Topografia topografia);
    public abstract boolean igualAgua();
    public abstract boolean igualTierra();
    public abstract boolean igualPantano();
}