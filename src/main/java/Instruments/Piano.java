package Instruments;

public class Piano extends Instrument {
    private int numberOfKeys;

    public Piano(String colour, String material, int numberOfKeys,double boughtPrice, double sellPrice, String make) {
        super(colour, material, InstrumentType.keyboard, boughtPrice, sellPrice, make);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys(){
        return this.numberOfKeys;
    }

    public String play(){
        return "I am playing piano!";
    }
}
