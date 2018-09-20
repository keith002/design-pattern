package com.example.designpattern.observerpattern.eventdelegationmode;

import java.util.Date;

public class WeGameListener {

    public WeGameListener(){
        System.out.println("WeGameListener 我正在看NBA,开始时间是：" + new Date());  System.out.println("");
    }

    public void stopWeGame(Date date) {
        System.out.println("WeGameListener 老师来了，快停止玩游戏 ， 结束时间是：" + date);
    }
}
