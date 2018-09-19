package com.example.designpattern.factorymethodpattern;

public class FactoryMethodTest {

    public static void main(String[] args) {
        IFactory iFactory = new UndergraduateFactory();
        LeiFeng leiFeng = iFactory.createLeiFeng();

        leiFeng.buyRice();
        leiFeng.sweep();
        leiFeng.wash();
    }

}
