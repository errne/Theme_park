package Attractions;

import Behaviours.ISecurity;
import Behaviours.ITicketed;
import Visitor.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {
    private double defaultPrice;

    public Rollercoaster(String name) {

        super(name);
        this.defaultPrice = 8.4;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge()>=12 && visitor.getHeight()>= 145){
            return true;
        }
        return false;
    }

    @Override
    public double defaultPrice() {
        return this.defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight()>= 200){
            return this.defaultPrice*2;
        }
        return defaultPrice;
    }
}
