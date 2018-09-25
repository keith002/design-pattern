package com.example.designpattern.abstractfactorypattern;

public abstract class AbstractProductB {

    /**
     * class_name: 每个产品都共有的方法
     * param:
     * describe: TODO
     * creat_user: Keith002@sina.com
     * creat_date: 2018/9/25
     * creat_time: 16:40
     **/
    public void shareMethod(){
        System.out.println("共享方法");
    }

    /**
     * class_name: 每个产品相同的方法 不同实现
     * param:
     * describe: TODO
     * creat_user: Keith002@sina.com
     * creat_date: 2018/9/25
     * creat_time: 16:40
     **/
    public abstract void doSomething();
}
