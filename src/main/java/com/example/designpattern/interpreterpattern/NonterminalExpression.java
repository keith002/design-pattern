package com.example.designpattern.interpreterpattern;

public class NonterminalExpression extends AbstractExpresion {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解析器");
    }
}
