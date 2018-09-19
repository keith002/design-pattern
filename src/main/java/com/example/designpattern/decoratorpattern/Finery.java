package com.example.designpattern.decoratorpattern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Finery extends Person{

    protected Person person;

    public void Decorate(Person person){
        this.person = person;
    }

    public void show(){
        if(person != null){
            person.show();
        }
    }
}
