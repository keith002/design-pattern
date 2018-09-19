package com.example.designpattern.builderpattern;

public class Director {

    Builder builder;

   public void construt(Builder builder){
       builder.builderA();
       builder.builderB();
   }


}
