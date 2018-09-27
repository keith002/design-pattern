package com.example.designpattern.chainofresponsibility;

public abstract class Handler {

    protected Handler handler;

    public void setHandler(Handler handler){
        this.handler = handler;
    }

    public abstract void handlerRequest(int request);
}
