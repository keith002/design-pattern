package com.example.designpattern.abstractfactorypattern;

public class Creater2 extends AbstractCreater {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
