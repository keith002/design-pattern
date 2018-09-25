package com.example.designpattern.abstractfactorypattern;

/**
 * class_name: 抽象工厂类
 * package: com.example.designpattern.abstractfactorypattern
 * describe: TODO
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/25
 * creat_time: 16:48
 **/
public abstract class AbstractCreater {
    /**
     * class_name: 创建A产品
     * param:
     * describe: TODO
     * creat_user: Keith002@sina.com
     * creat_date: 2018/9/25
     * creat_time: 16:48
     **/
    public abstract AbstractProductA createProductA();

    /**
     * class_name: 创建B产品
     * param:
     * describe: TODO
     * creat_user: Keith002@sina.com
     * creat_date: 2018/9/25
     * creat_time: 16:48
     **/
    public abstract AbstractProductB createProductB();

}
