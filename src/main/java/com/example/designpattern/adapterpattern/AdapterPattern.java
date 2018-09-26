package com.example.designpattern.adapterpattern;

public class AdapterPattern {
    public static void main(String[] args) {
        Target target = new Adapter();

        target.request();

    }
}
