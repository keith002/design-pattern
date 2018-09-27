package com.example.designpattern.mediatorpattern;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

}
