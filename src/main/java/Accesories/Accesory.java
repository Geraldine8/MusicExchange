package Accesories;

import Shop.ShopItem;

public abstract class Accesory extends ShopItem {
    private int quantity;

    public Accesory(double boughtPrice, double sellPrice, int quantity) {
        super(boughtPrice, sellPrice);
        this.quantity = quantity;
    }

    public int getQuantity(){
        return  this.quantity;
    }


}
