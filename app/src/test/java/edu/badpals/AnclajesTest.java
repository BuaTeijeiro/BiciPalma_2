package edu.badpals;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AnclajesTest {

    Anclajes anclajes;
    Bicicleta myBici;

    @Before
    public void setup() {
        this.anclajes = new Anclajes(6);
        this.myBici = new Bicicleta(1);
    }

    @Test
    public void numAnclajesTest(){
        assertEquals(6, anclajes.numAnclajes());
    }

    @Test
    public void isAnclajeOcupadoTest(){
        assertEquals(false, anclajes.isAnclajeOcupado(0));
        assertEquals(false, anclajes.isAnclajeOcupado(1));
        assertEquals(false, anclajes.isAnclajeOcupado(2));
        assertEquals(false, anclajes.isAnclajeOcupado(3));
        assertEquals(false, anclajes.isAnclajeOcupado(4));
        assertEquals(false, anclajes.isAnclajeOcupado(5));
    }

    @Test
    public void ocuparAnclajeTest(){
        anclajes.ocuparAnclaje(0, myBici);
        assertEquals(true, anclajes.isAnclajeOcupado(0));
        assertEquals(1, anclajes.getBiciAt(0).getId());
    }

    @Test
    public void liberarAnclajeTest(){
        anclajes.ocuparAnclaje(0, myBici);
        assertEquals(true, anclajes.isAnclajeOcupado(0));
        assertEquals(1, anclajes.getBiciAt(0).getId());
        anclajes.liberarAnclaje(0);
        assertEquals(false, anclajes.isAnclajeOcupado(0));
    }

    @Test
    public void seleccionarAnclajeTest(){
        assertEquals(0,anclajes.seleccionarAnclaje());
        anclajes.ocuparAnclaje(0, myBici);
        assertEquals(1,anclajes.seleccionarAnclaje());
        anclajes.ocuparAnclaje(1, myBici);
        assertEquals(2,anclajes.seleccionarAnclaje());
    }

    @Test
    public void toStringTest() {
        assertEquals("Numero de anclajes: 6", anclajes.toString());
    }
}
