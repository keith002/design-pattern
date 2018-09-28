package com.example.designpattern.visitorpattern;

public class Visitorpattern {

    public static void main(String[] args) {

        ObjectStructu objectStructu = new ObjectStructu();
        objectStructu.addElementList(new ConcreteElementA());
        objectStructu.addElementList(new ConcreteElementB());

        objectStructu.visitor(new ConcreteVisitor1());
        objectStructu.visitor(new ConcreteVisitor2());

    }
}
