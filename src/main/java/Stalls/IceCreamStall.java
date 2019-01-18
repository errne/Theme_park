package Stalls;

import Behaviours.ITicketed;
import Visitor.Visitor;

public class IceCreamStall extends Stall implements ITicketed {
    private double defaultPrice;

    public IceCreamStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.defaultPrice = 2.8;
    }

    @Override
    public double defaultPrice() {
        return this.defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return this.defaultPrice;
    }
}
