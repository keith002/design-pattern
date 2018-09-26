package com.example.designpattern.adapterpattern;

public class Adapter extends Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
