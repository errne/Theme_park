
package Behaviours;


import Visitor.Visitor;

public interface ITicketed {
    double defaultPrice();

    double priceFor(Visitor visitor);
}
