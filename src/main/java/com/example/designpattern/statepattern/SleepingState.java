package com.example.designpattern.statepattern;

public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHours() + "点 不行了睡觉");
    }
}
