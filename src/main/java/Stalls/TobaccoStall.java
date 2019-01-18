package Stalls;

import Behaviours.ISecurity;
import Behaviours.ITicketed;
import Visitor.Visitor;

public class TobaccoStall extends Stall implements ISecurity, ITicketed {
    private double defaultPrice;
    public TobaccoStall(String name, String ownerName, String parkingSpot) {

        super(name, ownerName, parkingSpot);
        this.defaultPrice = 6.6;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge()>=18){
            return true;
        }
        return false;
    }

    @Override
    public double defaultPrice() {
        return defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return defaultPrice;
    }
}
