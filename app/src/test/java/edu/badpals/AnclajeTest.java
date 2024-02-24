package edu.badpals;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        assertTrue(anclaje.isOcupado());
    }

    @Test
    public void getBicicletaTest() {
        anclaje.anclarBici(bici);
        assertEquals(999, anclaje.getBicicleta().getId());
    }

    
    @Test
    public void liberarBiciTest() {
        anclaje.anclarBici(bici);
        assertEquals(999, anclaje.getBicicleta().getId());
        assertTrue(anclaje.isOcupado());
        anclaje.liberarBici();
        assertEquals(null, anclaje.getBicicleta());
        assertTrue(!anclaje.isOcupado());
    }

    @Test
    public void toStringTest(){
        assertEquals("libre",anclaje.toString());
        anclaje.anclarBici(bici);
        assertEquals("ocupado por bici de id 999",anclaje.toString());
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