package com.example.designpattern.factorymethodpattern.simplefactory;

/**
 * class_name: FactoryModelTest
 * package: com.example.designpattern.factorymethodpattern
 * describe: 测试简单工厂模式
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/18
 * creat_time: 14:01
 **/
public class FactoryModelTest {

    public static void main(String[] args) {
        Double a = 10d;
        Double b = 0d;
        Operation operation = OperationFactory.createOperation("/");
        operation.setNumberA(a);
        operation.setNumberB(b);

        System.out.println(operation.getResult());
    }
}
