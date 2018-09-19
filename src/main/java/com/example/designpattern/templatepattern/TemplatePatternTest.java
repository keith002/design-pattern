package com.example.designpattern.templatepattern;

public class TemplatePatternTest {

    public static void main(String[] args) {
        System.out.println("学生甲得试卷");
        TestPaper testPaper01 = new TestPaperA();
        testPaper01.testQuestion1();
        testPaper01.testQuestion2();
        testPaper01.testQuestion3();

        System.out.println("------------------------------------------");

        System.out.println("学生乙得试卷");
        TestPaper testPaper02 = new TestPaperA();
        testPaper02.testQuestion1();
        testPaper02.testQuestion2();
        testPaper02.testQuestion3();
    }
}
