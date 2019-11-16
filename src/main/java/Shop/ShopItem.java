package Shop;

import Behaviours.ISell;

public abstract class ShopItem implements ISell {
    private double boughtPrice;
    private double sellPrice;

    public ShopItem(double boughtPrice, double sellPrice){
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;

    }

    public double getBoughtPrice(){
        return this.boughtPrice;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public double calculateMarkup() {
        return sellPrice - boughtPrice;
    }


}
