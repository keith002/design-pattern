package com.example.designpattern.bridgepattern;

public abstract class Abstraction {

    public Implementor implementor;

    public void setImplementor(Implementor implementor){
        this.implementor = implementor;
    }

    public void run(){
        implementor.operationImp();
    }
}
