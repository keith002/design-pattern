package com.example.designpattern.sigletonpattern;
/**
 * class_name: 饿汉式 单例模式
 * package: com.example.designpattern.sigletonpattern
 * describe: TODO
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/27
 * creat_time: 17:00
 **/
public class SingletonStarving {

    private static SingletonStarving singletonStarving;

    private SingletonStarving(){}

    public static SingletonStarving getSinletonStarving(){
        if(singletonStarving == null){
            singletonStarving = new SingletonStarving();
        }
        return singletonStarving;
    }

    public static void show(){
        System.out.println("Hello World!");
    }
}
