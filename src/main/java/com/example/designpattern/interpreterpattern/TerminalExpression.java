package com.example.designpattern.interpreterpattern;

public class TerminalExpression extends AbstractExpresion {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解析器");
    }
}
