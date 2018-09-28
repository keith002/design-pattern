package com.example.designpattern.flyweightpattern;

public class ConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体 FlyWeight" + extrinsicstate);
    }
}
