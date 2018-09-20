package com.example.designpattern.observerpattern;

public class ObserverPatternTest {

    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver("小X", s));
        s.attach(new ConcreteObserver("小Y", s));
        s.attach(new ConcreteObserver("小Z", s));

        s.setSubjectStatus("ABC");
        s.notifyX();


    }
}
