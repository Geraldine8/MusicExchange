package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before(){
        drum = new Drum("Cherry", "Wood", 8, 400, 800, "Yamaha");
    }

    @Test
    public void hasColour(){
        assertEquals("Cherry", drum.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", drum.getMaterial());
    }

    @Test
    public void hasNumberOfPieces(){
        assertEquals(8, drum.getNumberOfpieces());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(400, drum.getBoughtPrice(), 0.01);
    }


    @Test
    public void hasSellPrice(){
        assertEquals(800, drum.getSellPrice(), 0.01);
    }

    @Test
    public void hasMake(){
        assertEquals("Yamaha", drum.getMake());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.percussion, drum.getInstrumentType());
    }

    @Test
    public void calculateMarkup(){
        assertEquals(400, drum.calculateMarkup(), 0.01);
    }

    @Test
    public void playInstrument(){
        assertEquals("Ba Dum Tsss!", drum.play());
    }

}
