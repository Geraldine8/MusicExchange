package Shop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;
    private String name;

    public Shop(String name) {
        this.stock = new ArrayList<ISell>();
        this.name = name;
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addStock(ISell item){
        this.stock.add(item);
    }

    public void removeItem(ISell item){
        this.stock.remove(item);
    }

    public double calculateProfit(){
        double total = 0;
        for (ISell item: stock){
            total += item.calculateMarkup();
        }
        return total;
    }

    public  String getname(){
        return this.name;
    }

}
