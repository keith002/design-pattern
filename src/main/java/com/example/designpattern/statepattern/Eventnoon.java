package com.example.designpattern.statepattern;

public class Eventnoon extends State {
    @Override
    public void writeProgram(Work work) {
        if(work.getFinish()){
            work.setState(new RestState());
            work.writeProgram();
        }else{
            if(work.getHours() < 21){
                System.out.println("当前时间：" + work.getHours() + "点 加班哦，疲劳之极");
            }else{
                work.setState(new SleepingState());
                work.writeProgram();
            }

        }

    }
}
