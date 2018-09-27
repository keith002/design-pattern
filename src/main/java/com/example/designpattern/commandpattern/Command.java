package com.example.designpattern.commandpattern;

public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public abstract void excute();

}
