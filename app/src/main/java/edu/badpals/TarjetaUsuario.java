package edu.badpals;

public class TarjetaUsuario {
    int id;
    boolean activada;

    TarjetaUsuario(int id, boolean activada){
        this.id = id;
        this.activada = activada;
    }

    public int getId() {
        return this.id;
    }
    public boolean isActivada(){
        return this.activada;
    }

    public void setActivada(boolean newActivada){
        this.activada = newActivada;
    }

    @Override
    public String toString(){
        return "Tarjeta con id: " + this.getId() + " \nActivada: " + this.isActivada();
    }
}
