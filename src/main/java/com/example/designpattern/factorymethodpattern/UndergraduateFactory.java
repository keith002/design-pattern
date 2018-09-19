package com.example.designpattern.factorymethodpattern;

public class UndergraduateFactory implements IFactory{

    @Override
    public Undergraduate createLeiFeng(){
        return new Undergraduate();
    }
}
