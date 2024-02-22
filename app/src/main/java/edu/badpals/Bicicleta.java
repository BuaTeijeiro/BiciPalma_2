package edu.badpals;

public class Bicicleta {
    final int id;

    public Bicicleta(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString(){
        return Integer.toString(this.getId());
    }
    
}
