package edu.badpals;

public class Anclajes {
    Anclaje[] anclajes;

    Anclajes(int numAnclajes){
        this.anclajes = new Anclaje[numAnclajes];
    }

    /*
    private void crearAnclajes(){
        for (int i = 0; i < numAnclajes)
    } */

    int numAnclajes(){
        return anclajes.length;
    }
}
