package com.example.designpattern.visitorpattern;

public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitonConcreteElementB(this);
    }
}
