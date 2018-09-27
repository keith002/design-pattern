package com.example.designpattern.sigletonpattern;
/**
 * class_name: 静态内部类
 * package: com.example.designpattern.sigletonpattern
 * describe: TODO
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/27
 * creat_time: 17:03
 **/
public class SingletonStatic {
    private SingletonStatic() {}

    private static class SingletonHodler{
        private static final SingletonStatic singletonStatic = new SingletonStatic();
    }

    public static final SingletonStatic getSingletonStatic(){
        return SingletonHodler.singletonStatic;
    }

    public static void show(){
        System.out.println("Hello World!");
    }

}
