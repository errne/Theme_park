package Interfaces;

import Visitor.Visitor;

public interface ISecurity {
    boolean isAllowedTo(Visitor visitor);
}
