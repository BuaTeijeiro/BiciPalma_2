package edu.badpals;

public class Anclaje {
    private boolean ocupado;
    private Bicicleta bici;

    public Anclaje(){
        this.ocupado = false;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }

    private void setOcupado(boolean updateOcupado){
        this.ocupado = updateOcupado;
    }

    public void anclarBici(Bicicleta newBici){
        this.bici = newBici;
        setOcupado(true);    
    }

    public Bicicleta getBicicleta(){
            return this.bici;
    }
}