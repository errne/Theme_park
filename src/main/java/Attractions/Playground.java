package Attractions;

import Behaviours.ISecurity;
import Visitor.Visitor;

public class Playground extends Attraction implements ISecurity {
    public Playground(String name) {
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge()<15) {
            return true;
        }
        return false;
    }
}
