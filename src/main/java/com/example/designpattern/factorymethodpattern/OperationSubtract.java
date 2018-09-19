package com.example.designpattern.factorymethodpattern;
/**
 * class_name: OperationSubtract
 * package: com.example.designpattern.factorymethodpattern
 * describe: 创建减法运算类
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/18
 * creat_time: 13:59
 **/
public class OperationSubtract extends Operation {

    @Override
    public Double getResult(){
        super.setResult(getNumberA() - getNumberB());
        return super.getResult();
    }
}
