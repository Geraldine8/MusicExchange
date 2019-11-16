package Accesories;

import Shop.ShopItem;

public abstract class Accesory extends ShopItem {
    private String make;

    public Accesory(double boughtPrice, double sellPrice, String make) {
        super(boughtPrice, sellPrice);
        this.make = make;
    }

    public String getMake(){
        return  this.make;
    }


}
