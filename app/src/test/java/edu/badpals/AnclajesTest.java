package edu.badpals;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AnclajesTest {

    Anclajes anclajes;

    @Before
    public void setup() {
        this.anclajes = new Anclajes(6);
    }

    @Test
    public void numAnclajesTest(){
        assertEquals(6, anclajes.numAnclajes());
    }

    /*
    @Test
    public void toStringTest() {
        assertEquals("Numero de anclajes: 6", anclajes.toString());
    }  */
}
