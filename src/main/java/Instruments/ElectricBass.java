package Instruments;

public class ElectricBass extends Instrument {

    private int numberOfStrings;
    public ElectricBass(String colour, String material, int numberOfStrings, double boughtPrice, double sellPrice, String make) {
        super(colour, material, InstrumentType.string, boughtPrice, sellPrice, make);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }

    public String play(){
        return "Brbr deing brbr deng!";
    }



}
