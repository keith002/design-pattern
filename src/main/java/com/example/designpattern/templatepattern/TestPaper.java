package com.example.designpattern.templatepattern;

public abstract class TestPaper {

    public void testQuestion1(){
        System.out.println("问题：杨过得到，后来给了郭靖，练成倚天剑、屠龙刀的玄铁可能是【】");
        System.out.println("A:球磨铸铁");
        System.out.println("B:马口铁");
        System.out.println("C:高速合金钢");
        System.out.println("D:碳素纤维");
        System.out.println("答案：" + getAnswer1());
    }

    public void testQuestion2(){
        System.out.println("问题：杨过、程英、陆无双铲除除了情花，造成【】");
        System.out.println("A:使这种植物补在害人");
        System.out.println("B:使一种珍稀物种灭绝");
        System.out.println("C:破坏那个生物圈的生态平衡");
        System.out.println("D:造成该地区沙漠化");
        System.out.println("答案：" + getAnswer2());
    }


    public void testQuestion3(){
        System.out.println("问题：蓝凤凰致使华山师徒‘桃谷六仙呕吐不止，如果你是大夫，会给他们开沙漠药【】’");
        System.out.println("A:阿司匹林");
        System.out.println("B:牛黄解毒片");
        System.out.println("C:氟哌酸");
        System.out.println("D:让他们喝大量生牛奶");
        System.out.println("E:以上全不对");
        System.out.println("答案：" + getAnswer3());
    }

    protected abstract String getAnswer1();

    protected abstract String getAnswer2();

    protected abstract String getAnswer3();
}
