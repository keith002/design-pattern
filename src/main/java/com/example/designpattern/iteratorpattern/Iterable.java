package com.example.designpattern.iteratorpattern;

public abstract class Iterable {

    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();

}
