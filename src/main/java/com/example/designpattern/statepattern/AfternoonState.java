package com.example.designpattern.statepattern;

public class AfternoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHours() < 17){
            System.out.println("当前时间：" + work.getHours() + "点 下午状态还不错，继续努力");
        }else{
            work.setState(new Eventnoon());
            work.writeProgram();
        }
    }
}
