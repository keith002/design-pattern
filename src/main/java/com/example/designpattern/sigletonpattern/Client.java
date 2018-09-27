package com.example.designpattern.sigletonpattern;

public class Client {

    public static void main(String[] args) {
        SingletonDoubleChecked singleton1 = SingletonDoubleChecked.getSingletonDoubleChecked();
        SingletonDoubleChecked singleton2= SingletonDoubleChecked.getSingletonDoubleChecked();
        if(singleton1 == singleton2){
            System.out.println("两个对象是相同的实例");
        } else {
            System.out.println("两个对象是不相同的实例");
        }
    }
}
