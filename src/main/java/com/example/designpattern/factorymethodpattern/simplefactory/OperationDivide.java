package com.example.designpattern.factorymethodpattern.simplefactory;
/**
 * class_name: OperationDivide
 * package: com.example.designpattern.factorymethodpattern
 * describe: 创建除法运算类   除数为0 抛出异常
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/18
 * creat_time: 13:58
 **/
public class OperationDivide extends Operation {

    @Override
    public Double getResult() {
        if (Double.compare(getNumberB(), 0d) == 0) throw new ArithmeticException();
        super.setResult(getNumberA() / getNumberB());
        return super.getResult();
    }

}
