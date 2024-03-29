package edu.badpals;

public class TarjetaUsuario {
    String id;
    boolean activada;

    TarjetaUsuario(String id, boolean activada){
        this.id = id;
        this.activada = activada;
    }

    public String getId() {
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
        return "Tarjeta con id: " + this.getId() + " \nActivada: " + Boolean.toString(this.isActivada());
    }
}
