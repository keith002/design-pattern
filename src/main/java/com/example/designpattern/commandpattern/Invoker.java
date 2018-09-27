package com.example.designpattern.commandpattern;

public class Invoker {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.excute();
    }

}
