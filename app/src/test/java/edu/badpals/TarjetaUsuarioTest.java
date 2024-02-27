package edu.badpals;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

public class TarjetaUsuarioTest {
    TarjetaUsuario miTarjeta;

    @Before
    public void setup(){
        this.miTarjeta = new TarjetaUsuario("1",false);
    }

    @Test
    public void constructorTarjetaUsuario() {
        assertEquals("1", this.miTarjeta.getId());
        assertEquals(false, this.miTarjeta.isActivada());
    }

    @Test
    public void setActivadaTest() {
        miTarjeta.setActivada(true);
        assertEquals("1", this.miTarjeta.getId());
        assertEquals(true, this.miTarjeta.isActivada());
    }

    @Test
    public void toStringTest(){
        assertEquals("Tarjeta con id: 1 \nActivada: false",miTarjeta.toString());
    }
}

    