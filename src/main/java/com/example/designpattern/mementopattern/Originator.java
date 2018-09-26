package com.example.designpattern.mementopattern;

import lombok.Data;

@Data
public class Originator {
    public boolean state;

    public void setMemento(Memento memento){
        state = memento.isState();
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void show(){
        System.out.println("当前状态：" + state);
    }
}
