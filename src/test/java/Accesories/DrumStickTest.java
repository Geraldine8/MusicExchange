package Accesories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before(){
        drumStick = new DrumStick(10, 20, "Yamaha");
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(10, drumStick.getBoughtPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(20, drumStick.getSellPrice(), 0.01);
    }

    @Test
    public void hasMake(){
        assertEquals("Yamaha", drumStick.getMake());
    }

    @Test
    public void calculateMarkup(){
        assertEquals(10, drumStick.calculateMarkup(), 0.01);
    }
}
