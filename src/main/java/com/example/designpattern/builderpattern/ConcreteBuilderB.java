package com.example.designpattern.builderpattern;

public class ConcreteBuilderB extends Builder{

    Product product = new Product();

    @Override
    public void builderA() {
        product.setParts("零件Y");
    }

    @Override
    public void builderB() {
        product.setParts("零件X");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
