package com.example.designpattern.statepattern;

public class Client {
    public static void main(String[] args) {
        Work w = new Work();
        w.setHours(9);
        w.writeProgram();
        w.setHours(10);
        w.writeProgram();
        w.setHours(12);
        w.writeProgram();
        w.setHours(13);
        w.writeProgram();
        w.setHours(14);
        w.writeProgram();
        w.setHours(17);

        w.setFinish(false);

        w.setHours(19);
        w.writeProgram();
        w.setHours(22);
        w.writeProgram();
    }
}
