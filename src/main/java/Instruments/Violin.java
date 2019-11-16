package Instruments;

public class Violin extends Instrument {
    private String size;
    public Violin(String colour, String material,  String size, double boughtPrice, double sellPrice, String make) {
        super(colour, material, InstrumentType.string, boughtPrice, sellPrice, make);
        this.size = size;
    }

    public String getSize(){
        return this.size;
    }
    public String play(){
        return "I am playing violin!";
    }
}
