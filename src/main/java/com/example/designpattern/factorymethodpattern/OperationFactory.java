package com.example.designpattern.factorymethodpattern;

/**
 * class_name: OperationFactory
 * package: com.example.designpattern.factorymethodpattern
 * describe: 创建对应的运算类
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/18
 * creat_time: 13:46
 **/
public class OperationFactory {


    public static Operation createOperation(String operator) {
        Operation operation = null;
        switch(operator) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSubtract();
                break;
            case "*":
                operation = new OperationMultiple();
                break;
            case "/":
                operation = new OperationDivide();
                break;
        }
        return operation;
    }
}
