package com.example.designpattern.mediatorpattern;

public class Client {

    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA(concreteMediator);
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB(concreteMediator);

        concreteMediator.setConcreteColleagueA(concreteColleagueA);
        concreteMediator.setConcreteColleagueB(concreteColleagueB);

        concreteColleagueA.send("吃饭了吗？");
        concreteColleagueB.send("没有那, 你打算请客？");
    }
}
