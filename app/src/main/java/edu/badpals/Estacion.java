package edu.badpals;

public class Estacion {
    private int id;
    private String direccion;
    private Anclajes anclajes;
    
    Estacion(int id, String direccion, int numAnclajes){
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    private int getId(){
        return this.id;
    }

    private String getDireccion(){
        return this.direccion;
    }

    private Anclaje[] anclajes(){
        return this.anclajes.getAnclajes();
    }

    private int numAnclajes(){
        return this.anclajes().length;
    }

    @Override
    public String toString(){
        return "id: " + Integer.toString(this.getId()) + " \ndireccion: " + this.getDireccion() + " \nanclajes: " + this.numAnclajes();
    }
}
