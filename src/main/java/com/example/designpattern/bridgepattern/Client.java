package com.example.designpattern.bridgepattern;

public class Client {

    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();

        Implementor implementorB = new ConcreteImplementorB();

        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(implementorA);
        abstraction.run();

        abstraction.setImplementor(implementorB);
        abstraction.run();
    }
}
