package com.example.designpattern.builderpattern;

public class BuilderPatternTest {

    public static void main(String[] args) {
        ConcreteBuilderA concreteBuilderA = new ConcreteBuilderA();
        Director director = new Director();
        director.construt(concreteBuilderA);
        Product product = concreteBuilderA.getResult();
        product.show();
    }
}
