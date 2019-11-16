package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricBassTest {

    ElectricBass electricBass;

    @Before
    public void before(){
        electricBass = new ElectricBass("Black", "Wood", 4, 300, 600, "Fender");
    }

    @Test
    public void hasColour(){
        assertEquals("Black", electricBass.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", electricBass.getMaterial());
    }

    @Test
    public void hasNumberOfPieces(){
        assertEquals(4, electricBass.getNumberOfStrings());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(300, electricBass.getBoughtPrice(), 0.01);
    }


    @Test
    public void hasSellPrice(){
        assertEquals(600, electricBass.getSellPrice(), 0.01);
    }

    @Test
    public void hasMake(){
        assertEquals("Fender", electricBass.getMake());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.string, electricBass.getInstrumentType());
    }

    @Test
    public void calculateMarkup(){
        assertEquals(300, electricBass.calculateMarkup(), 0.01);
    }

    @Test
    public void playInstrument(){
        assertEquals("Brbr deing brbr deng!", electricBass.play());
    }
}
