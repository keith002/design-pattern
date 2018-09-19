package com.example.designpattern.factorymethodpattern.simplefactory;

import lombok.Data;

/**
 * class_name: Operation
 * package: com.example.designpattern.factorymethodpattern
 * describe: 运算父类
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/18
 * creat_time: 13:59
 **/
@Data
public class Operation {

    private Double numberA;
    private Double numberB;
    private  Double result = 0d;

    public Double getResult(){
        return result;
    }

}
