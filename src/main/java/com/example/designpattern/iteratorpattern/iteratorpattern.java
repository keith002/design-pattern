package com.example.designpattern.iteratorpattern;

public class iteratorpattern {

    public static void main(String[] args) {
        ConcreteAggregate ca = new ConcreteAggregate();
        ca.set("A");
        ca.set("B");
        ca.set("C");
        ca.set("D");
        ca.set("E");
        ca.set("F");
        ca.set("G");

        Iterable iterable = new ConcreteIterator(ca);
        Object item = iterable.first();
        System.out.println(item);
        while(!iterable.isDone()){
            System.out.println(iterable.currentItem());
            iterable.next();
        }
    }
}
