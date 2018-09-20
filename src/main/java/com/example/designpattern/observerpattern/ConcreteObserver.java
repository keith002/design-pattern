package com.example.designpattern.observerpattern;

import lombok.Data;

@Data
public class ConcreteObserver extends Observer {

    String observerStatus;
    String name;
    ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerStatus = subject.getSubjectStatus();
        System.out.println("观察者" + name + "的新状态是" + observerStatus);
    }
}
