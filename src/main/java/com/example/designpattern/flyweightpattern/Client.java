package com.example.designpattern.flyweightpattern;

public class Client {

    public static void main(String[] args) {
        int extrinsicstate = 22;

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight fx = flyweightFactory.getFlyweight("X");
        fx.operation(--extrinsicstate);

        Flyweight fy = flyweightFactory.getFlyweight("Y");
        fx.operation(--extrinsicstate);

        Flyweight fz = flyweightFactory.getFlyweight("Z");
        fx.operation(--extrinsicstate);

        Flyweight flyweight = new UnsharedConcreteFlyweight();
        flyweight.operation(--extrinsicstate);


    }

}
