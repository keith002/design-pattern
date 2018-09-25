package com.example.designpattern.statepattern;

public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHours() < 12){
            System.out.println("当前时间：" + work.getHours() + "点 上午工作，精神百倍");
        }else{
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
