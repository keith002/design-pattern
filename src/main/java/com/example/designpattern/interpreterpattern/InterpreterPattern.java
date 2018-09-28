package com.example.designpattern.interpreterpattern;

import java.util.ArrayList;
import java.util.List;

public class InterpreterPattern {

    public static void main(String[] args) {
        Context context = new Context();

        List<AbstractExpresion> list = new ArrayList<>();
        list.add(new NonterminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());

        list.forEach(x -> x.interpret(context));

    }
}
