package com.example.designpattern.proxypattern;

public class ProxyPatternTest {

    public static void main(String[] args) {

        SchoolGirl schoolGirl = new SchoolGirl("小V");

        Pursuit pursuit = new Pursuit(schoolGirl);

        Proxy proxy = new Proxy(pursuit);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }


}
