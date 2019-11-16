package Accesories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(3, 9, "Generic");
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(3, sheetMusic.getBoughtPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(9, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void hasMake(){
        assertEquals("Generic", sheetMusic.getMake());
    }

    @Test
    public void calculateMarkup(){
        assertEquals(6, sheetMusic.calculateMarkup(), 0.01);
    }
}

