package com.example.designpattern.sigletonpattern;

/**
 * class_name: 双重校验锁 单例模式
 * package: com.example.designpattern.sigletonpattern
 * describe: TODO
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/27
 * creat_time: 17:00
 **/
public class SingletonDoubleChecked {

    private static volatile SingletonDoubleChecked singletonDoubleChecked;

    private SingletonDoubleChecked() {
    }

    public static SingletonDoubleChecked getSingletonDoubleChecked() {
        if (singletonDoubleChecked == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (singletonDoubleChecked == null) {
                    singletonDoubleChecked = new SingletonDoubleChecked();
                }
            }
        }
        return singletonDoubleChecked;
    }

    public static void show(){
        System.out.println("Hello World!");
    }
}
