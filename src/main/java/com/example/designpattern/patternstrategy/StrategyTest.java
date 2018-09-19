package com.example.designpattern.patternstrategy;

public class StrategyTest {

    public static void main(String[] args) {
        Double money = 10d;
        Double num = 2d;
        String discount = "正常收费";
        CashContext cc = new CashContext(discount);
        CashSuper cs = cc.getCs();
        cs.setMoney(money * num);
        Double totle = cs.acceptCash();
        System.out.println("-----> " + totle);
    }
}
