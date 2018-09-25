package com.example.designpattern.statepattern;

public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHours() + "点 下班回家");
    }
}
