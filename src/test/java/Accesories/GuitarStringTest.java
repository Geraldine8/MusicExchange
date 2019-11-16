package Accesories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString(8, 30, "Fender");

    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(8, guitarString.getBoughtPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(30, guitarString.getSellPrice(), 0.01);
    }

    @Test
    public void hasMake(){
        assertEquals("Fender", guitarString.getMake());
    }

    @Test
    public void calculateMarkup(){
        assertEquals(22, guitarString.calculateMarkup(), 0.01);
    }
}

