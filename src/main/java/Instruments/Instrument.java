package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import Shop.ShopItem;

public abstract class Instrument extends ShopItem implements IPlay {
    private String colour;
    private String material;
    private InstrumentType instrumentType;
    private String make;

    public Instrument(String colour, String material, InstrumentType instrumentType, double boughtPrice, double sellPrice, String make){
        super(boughtPrice, sellPrice);
        this.colour = colour;
        this.material = material;
        this.instrumentType = instrumentType;
        this.make = make;
    }

    public String getColour(){
        return this.colour;
    }

    public String getMaterial(){
        return this.material;
    }

    public InstrumentType getInstrumentType(){
        return this.instrumentType;
    }

    public String getMake(){
        return this.make;
    }



}
