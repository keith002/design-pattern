package com.example.designpattern.mediatorpattern;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }
    public void send(String message){
        mediator.send(message,this);
    }
    public void notify(String message){
        System.out.println("同事1得到信息" + message);
    }
}
