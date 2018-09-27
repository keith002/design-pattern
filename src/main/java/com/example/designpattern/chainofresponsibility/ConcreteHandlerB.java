package com.example.designpattern.chainofresponsibility;

public class ConcreteHandlerB extends Handler{
    @Override
    public void handlerRequest(int request) {
        if(request >= 10 && request< 20){
            System.out.println(this.getClass().getSimpleName()+" 请求批准 " + request);
        }else{
            handler.handlerRequest(request);
        }
    }
}
