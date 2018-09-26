package com.example.designpattern.mementopattern;

public class MementoPattern {

    public static void main(String[] args) {
        // Originator 初始化
        Originator originator = new Originator();
        originator.setState(false);
        //保存状态
        Memento memento = originator.createMemento();
        memento.setState(originator.isState());

        originator.show();
        //Originator 状态属性变化
        originator.setState(true);

        originator.show();
        //恢复原始状态
        originator.setMemento(memento);

        originator.show();
    }
}
