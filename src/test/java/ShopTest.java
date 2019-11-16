import Accesories.DrumStick;
import Accesories.GuitarString;
import Instruments.ElectricGuitar;
import Instruments.Trumpet;
import Instruments.Violin;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ElectricGuitar electricGuitar;
    Violin violin;
    Trumpet trumpet;
    DrumStick drumStick;
    GuitarString guitarString;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        electricGuitar = new ElectricGuitar("Blue", "Wood", 7, 400, 1200, "Ibanez");
        violin = new Violin("Brown", "Wood", "Full-size", 500, 1500,"Vuillaume a Paris" );
        trumpet = new Trumpet("Gold", "Metal", 4, 1500, 4000, "Yamaha");
        drumStick = new DrumStick(10, 20, "Generic");
        guitarString = new GuitarString(15, 40, "Fender");
    }


    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", shop.getname());
    }

    @Test
    public void countNumberofStockItems(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void addItem(){
        shop.addStock(electricGuitar);
        shop.addStock(guitarString);
        shop.addStock(drumStick);
        shop.addStock(trumpet);
        assertEquals(4, shop.getStockCount());
    }

    @Test
    public void removeItem(){
        shop.addStock(electricGuitar);
        shop.addStock(guitarString);
        shop.addStock(drumStick);
        shop.addStock(violin);
        shop.removeItem(electricGuitar);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void calculateProfit(){
        shop.addStock(electricGuitar);
        shop.addStock(guitarString);
        shop.addStock(drumStick);
        shop.addStock(violin);
        shop.addStock(electricGuitar);
        shop.addStock(trumpet);
        assertEquals(5135, shop.calculateProfit(), 0.01);
    }

}
