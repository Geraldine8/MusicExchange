package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricGuitarTest {

    ElectricGuitar electricGuitar;

    @Before
    public void before() {
        electricGuitar = new ElectricGuitar("Purple", "Wood", 7, 350, 700, "Ibanez");
    }

    @Test
    public void hasColour(){
        assertEquals("Purple", electricGuitar.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", electricGuitar.getMaterial());
    }

    @Test
    public void hasNumberOfPieces(){
        assertEquals(7, electricGuitar.getNumberOfStrings());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(350, electricGuitar.getBoughtPrice(), 0.01);
    }


    @Test
    public void hasSellPrice(){
        assertEquals(700, electricGuitar.getSellPrice(), 0.01);
    }

    @Test
    public void hasMake(){
        assertEquals("Ibanez", electricGuitar.getMake());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.string, electricGuitar.getInstrumentType());
    }

    @Test
    public void calculateMarkup(){
        assertEquals(350, electricGuitar.calculateMarkup(), 0.01);
    }

    @Test
    public void playInstrument(){
        assertEquals("I am playing guitar!", electricGuitar.play());
    }
}