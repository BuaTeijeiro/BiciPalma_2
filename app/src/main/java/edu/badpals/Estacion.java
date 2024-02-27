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

    public void consultarEstacion(){
        System.out.println(this.toString());
    }

    public int anclajesLibres(){
        int anclajesLibres = 0;
        for (int i = 0; i < this.numAnclajes(); i++){
            if (!this.anclajes()[i].isOcupado()){
                anclajesLibres++;
            }
        }

        return anclajesLibres;
    }

    public void anclarBicicleta(Bicicleta bici){
        int posicion = this.anclajes.seleccionarAnclaje();
        if(posicion >= 0){
            this.anclajes()[posicion].anclarBici(bici);
            this.mostrarAnclaje(bici, posicion + 1);
        }
    }

    private void mostrarAnclaje(Bicicleta bici,int numAnclajes){
        System.out.println("bicicleta: "+
                                Integer.toString(bici.getId())+
                                " anclada en el anclaje: "+
                                Integer.toString(numAnclajes));
    }

    public void consultarAnclajes(){
        int numeroAnclaje = 1;
        for (Anclaje anclaje : this.anclajes()){
            String message = "Anclaje " + Integer.toString(numeroAnclaje) + " ";
            if(anclaje.isOcupado()){
                message = message + Integer.toString(anclaje.getBicicleta().getId());
            } else{
                message = message + "libre";
            }
        numeroAnclaje ++;    
        System.out.println(message);
        }
    }
    public boolean leerTarjetaUsuario(TarjetaUsuario tarjeta){
        return tarjeta.isActivada();
    }

    public void retirarBicicleta(TarjetaUsuario tarjeta){
        if (this.leerTarjetaUsuario(tarjeta) && (this.anclajesLibres() != this.numAnclajes())){
            int posicionAnclaje = 1;
            for (Anclaje anclaje : this.anclajes()){
                if (anclaje.isOcupado()){
                    Bicicleta biciRetirada = anclaje.getBicicleta();
                    this.mostrarBicicleta(biciRetirada, posicionAnclaje);
                    anclaje.liberarBici();
                    break;
                }
                posicionAnclaje++;
            }
        }
    }

    private void mostrarBicicleta(Bicicleta bici, int numeroAnclaje){
        System.out.println("bicicleta retirada: " + Integer.toString(bici.getId()) + " del anclaje: " + Integer.toString(numeroAnclaje));
    }
}
