package com.example.designpattern.facadepattern;

public class Facade {

    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;
    SubSystemFour subSystemFour;

    public Facade() {
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
        this.subSystemThree = new SubSystemThree();
        this.subSystemFour = new SubSystemFour();
    }

    public  void methodA(){
        System.out.println("方法组A");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
        subSystemFour.methodFour();
    }

    public  void methodB(){
        System.out.println("方法组B");
        subSystemOne.methodOne();
        subSystemThree.methodThree();
        subSystemFour.methodFour();
    }
}
