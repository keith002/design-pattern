package com.example.designpattern.chainofresponsibility;

public class Client {

    public static void main(String[] args) {

        Handler h1 = new ConcreteHandlerA();
        Handler h2 = new ConcreteHandlerB();
        Handler h3 = new ConcreteHandlerC();

        h1.setHandler(h2);
        h2.setHandler(h3);

        Integer[] requests = {2,5,14,22,18,45,14,24};

        for (int i = 0; i < requests.length; i++) {
            h1.handlerRequest(requests[i]);
        }

    }

}
