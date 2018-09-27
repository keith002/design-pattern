package com.example.designpattern.sigletonpattern;

/**
 * class_name: 懒汉式 单例模式
 * package: com.example.designpattern.sigletonpattern
 * describe: TODO
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/27
 * creat_time: 17:03
 **/
public class SingletonSlacker {

    private static SingletonSlacker singletonSlacker = new SingletonSlacker();

    private SingletonSlacker() {
    }

    public static SingletonSlacker getSingletonSlacker() {
        return singletonSlacker;
    }

    public static void show(){
        System.out.println("Hello World!");
    }
}
