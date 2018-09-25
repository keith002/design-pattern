package com.example.designpattern.abstractfactorypattern;

public class Client {

    public static void main(String[] args) {
        AbstractCreater creater1 = new Creater1();

        AbstractCreater creater2 = new Creater2();

        AbstractProductA productA1 = creater1.createProductA();

        AbstractProductB productB1 = creater1.createProductB();

        AbstractProductA productA2 = creater2.createProductA();

        AbstractProductB productB2 = creater2.createProductB();

        productA1.doSomething();
        productB1.doSomething();

        productA2.doSomething();
        productB2.doSomething();
    }
}
