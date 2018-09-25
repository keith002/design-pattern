package com.example.designpattern.abstractfactorypattern;

public class Creater1 extends AbstractCreater {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return  new ProductB1();
    }
}
