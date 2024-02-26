package edu.badpals;

public class Anclajes {
    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes){
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes(){
        for (int i = 0; i < this.numAnclajes(); i++){
            anclajes[i] = new Anclaje();
        }
    }

    int numAnclajes(){
        return anclajes.length;
    }

    Anclaje[] getAnclajes(){
        return this.anclajes;
    }

    Boolean isAnclajeOcupado(int posicion){
        return this.getAnclajes()[posicion].isOcupado();
    }

    void ocuparAnclaje(int posicion, Bicicleta bici){
        this.getAnclajes()[posicion].anclarBici(bici);
    }

    Bicicleta getBiciAt(int posicion){
        return this.getAnclajes()[posicion].getBicicleta();
    }
    
    void liberarAnclaje(int posicion){
        this.getAnclajes()[posicion].liberarBici();
    }

    int seleccionarAnclaje(){
        for (int i = 0; i < this.numAnclajes();i++){
            if(!this.getAnclajes()[i].isOcupado()){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        return "Numero de anclajes: " + Integer.toString(this.numAnclajes());
    }
}
