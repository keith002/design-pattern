package com.example.designpattern.statepattern;

import lombok.Data;

@Data
public class Work {

    private State state;
    private double hours;
    private Boolean finish = false;

    public Work(){
        this.state = new ForenoonState();
    }

    public Work(State state){
        this.state = state;
    }

    public void writeProgram(){
        state.writeProgram(this);
    }
}
