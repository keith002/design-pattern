package com.example.designpattern.patternstrategy;

import lombok.Data;

/**
 * class_name: CashSuper
 * package: com.example.designpattern.patternstrategy
 * describe: TODO
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/18
 * creat_time: 15:04
 **/
@Data
public abstract class CashSuper {

    public Double money;

    public abstract Double acceptCash();
}
