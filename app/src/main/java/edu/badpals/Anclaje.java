package edu.badpals;

public class Anclaje {
    private boolean ocupado;
    private Bicicleta bici;

    Anclaje(){
        this.ocupado = false;
    }

    boolean isOcupado(){
        return this.ocupado;
    }

    private void setOcupado(boolean updateOcupado){
        this.ocupado = updateOcupado;
    }

    void anclarBici(Bicicleta newBici){
            this.bici = newBici;
            setOcupado(true);
    }

    Bicicleta getBicicleta(){
        return this.bici;
    }

    void liberarBici(){
        this.bici = null;
        setOcupado(false);
    }

    @Override
    public String toString(){
        if (ocupado) {
            return "ocupado por bici de id " + Integer.toString(this.bici.getId());
        } else{
            return "libre";
        }
    }
}