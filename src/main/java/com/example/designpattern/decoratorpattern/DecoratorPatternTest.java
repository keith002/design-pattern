package com.example.designpattern.decoratorpattern;

public class DecoratorPatternTest {


    public static void main(String[] args) {
        Person person = new Person("小K");
        TShirts tShirts = new TShirts();
        Jeans jeans = new Jeans();
        Sneaker sneaker = new Sneaker();

        tShirts.Decorate(person);
        jeans.Decorate(tShirts);
        sneaker.Decorate(jeans);

        sneaker.show();
    }
}
