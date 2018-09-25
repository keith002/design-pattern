package com.example.designpattern.statepattern;

public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHours() < 13){
            System.out.println("当前时间："+work.getHours()+"点 饿了，午饭，犯困，无休。");
        }else{
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
