package com.example.designpattern.visitorpattern;

public class ConcreteVisitor1 extends Visitor {
    @Override
    public void visitorConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() +"  " + this.getClass().getSimpleName() +"访问");
    }

    @Override
    public void visitonConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + " " + this.getClass().getSimpleName() + "访问");
    }
}
