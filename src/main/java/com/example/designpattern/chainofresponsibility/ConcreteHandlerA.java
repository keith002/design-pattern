package com.example.designpattern.chainofresponsibility;

public class ConcreteHandlerA extends Handler{
    @Override
    public void handlerRequest(int request) {
        if(request >= 0 && request< 10){
            System.out.println(this.getClass().getSimpleName()+" 请求批准 " + request);
        }else{
            handler.handlerRequest(request);
        }
    }
}
