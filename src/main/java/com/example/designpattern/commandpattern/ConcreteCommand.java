package com.example.designpattern.commandpattern;

public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver){
        super(receiver);
    }

    @Override
    public void excute() {
        receiver.action();
    }
}
