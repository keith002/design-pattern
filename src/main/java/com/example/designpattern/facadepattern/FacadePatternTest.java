package com.example.designpattern.facadepattern;

public class FacadePatternTest {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        System.out.println();
        facade.methodB();
    }
}
