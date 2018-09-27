package com.example.designpattern.chainofresponsibility;

public class ConcreteHandlerC extends Handler{
    @Override
    public void handlerRequest(int request) {
        if(request >= 20 && request< 30){
            System.out.println(this.getClass().getSimpleName()+" 请求批准 " + request);
        }else{
            System.out.println(this.getClass().getSimpleName()+" 请求不批准 " + request);
        }
    }
}
