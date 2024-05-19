package com.example;

import java.util.List;

public class Mixta extends Topografia {
    private List<Topografia> partes;

    public Mixta(List<Topografia> partes){
        this.partes = partes;
    }

    public List<Topografia> getPartes(){
        return partes;
    }
    public void setParte(Topografia parte){
        if (partes.size() < 4)
            partes.add(parte);
    }
    public void eliminarParte(Topografia parte){
        this.partes.remove(parte);
    }
    @Override
    public double proporcionAgua() {
        return partes.stream().mapToDouble(p -> p.proporcionAgua()).sum() / partes.size();
    }

    @Override
    public boolean igual(Topografia topografia) {
        return topografia.igualMixta(this);
    }
    @Override
    public boolean igualMixta(Mixta mixta){
        boolean resultado = false;
        if (this.partes.size() == mixta.getPartes().size()){
            resultado = true;
            List<Topografia> p = mixta.getPartes();
            for(int i=0; i < partes.size() && resultado; i++){
                Topografia t1 = this.partes.get(i);
                Topografia t2 = p.get(i);
                if(!t1.igual(t2))
                    resultado = false;
            }
        }
        return resultado;
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
        return false;
    }
}