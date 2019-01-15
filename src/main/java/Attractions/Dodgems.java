package Attractions;

import Interfaces.ITicketed;
import Visitor.Visitor;

public class Dodgems extends Attraction implements ITicketed {
    private double defaultPrice;
    public Dodgems(String name) {
        super(name);
        defaultPrice = 4.5;
    }


    @Override
    public double defaultPrice() {
        return this.defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12){
            return this.defaultPrice/2;
        }
        return this.defaultPrice;
    }
}
