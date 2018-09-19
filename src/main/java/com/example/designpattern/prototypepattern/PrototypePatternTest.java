package com.example.designpattern.prototypepattern;

public class PrototypePatternTest {

    public static void main(String[] args) {
        Resume resume = new Resume("小K");
        resume.setPersonalInfo("男","17");
        resume.setWorkExperience("2018-09-19","XXX");

        Resume resume01 = resume.clone();
        resume01.setPersonalInfo("女","17");
        resume01.setWorkExperience("2018-09-18","XXX");

        System.out.println("resume-> " + resume);
        System.out.println("resume01-> " + resume01);
        System.out.println();

        Resume resume02 = resume.deepClone();
        resume02.setPersonalInfo("女","18");
        resume02.setWorkExperience("2018-09-16","XXX");

        System.out.println("resume-> " + resume);
        System.out.println("resume02-> " + resume02);

    }
}
