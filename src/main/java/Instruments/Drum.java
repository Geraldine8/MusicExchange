package Instruments;

public class Drum extends Instrument {

    private int numberOfpieces;

    public Drum(String colour, String material, int numberOfpieces, double boughtPrice, double sellPrice, String make) {
        super(colour, material, InstrumentType.percussion, boughtPrice, sellPrice, make);
        this.numberOfpieces = numberOfpieces;
    }

    public int getNumberOfpieces(){
        return this.numberOfpieces;
    }

    public String play(){
        return "Ba Dum Tsss!";
    }

}
