package com.example.designpattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<String> parts = new ArrayList<>();


    public void setParts(String part){
        parts.add(part);
    }

    public void show(){
        parts.forEach(System.out::println);

    }

}
