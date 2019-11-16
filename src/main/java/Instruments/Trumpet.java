package Instruments;

public class Trumpet extends Instrument {
    private int numberOfValves;

    public Trumpet(String colour, String material, int numberOfValves, double boughtPrice, double sellPrice, String make) {
        super(colour, material,  InstrumentType.brass, boughtPrice, sellPrice, make);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves(){
        return this.numberOfValves;
    }

    public String play(){
        return "I am playing trumpet!";
    }
}
