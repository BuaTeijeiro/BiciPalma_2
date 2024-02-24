package edu.badpals;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class AnclajeTest {

    Bicicleta bici ;
    Anclaje anclaje;
    
    @Before 
    public void setup() {
        this.bici = new Bicicleta(999);
        this.anclaje = new Anclaje();
    }

    @Test
    public void constructorAnclajeTest() {
        assertEquals(false, anclaje.isOcupado());
    }

    @Test
    public void anclarBiciTest() {
        anclaje.anclarBici(bici);
        assertEquals(true, anclaje.isOcupado());
    }

    /*
    @Test
    public void toStringTest() {
        assertEquals("999", bici.toString());
    }

    
    @Test
    public void implementationMovilTest() {
        Movil movil = bici;
        assertEquals(999, movil.getId());
    }*/
}