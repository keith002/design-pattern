package com.example.designpattern.builderpattern;

public class ConcreteBuilderA extends Builder {

    Product product = new Product();

    @Override
    public void builderA() {
        product.setParts("零件A");
    }

    @Override
    public void builderB() {
        product.setParts("零件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
