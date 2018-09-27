package com.example.designpattern.mediatorpattern;

import lombok.Data;

@Data
public class ConcreteMediator extends Mediator {

    private ConcreteColleagueA concreteColleagueA;
    private ConcreteColleagueB concreteColleagueB;

    @Override
    public void send(String message, Colleague colleage) {
        if (concreteColleagueA == colleage) {
            concreteColleagueB.notify(message);
        } else if (concreteColleagueB == colleage) {
            concreteColleagueA.notify(message);
        }
    }
}
