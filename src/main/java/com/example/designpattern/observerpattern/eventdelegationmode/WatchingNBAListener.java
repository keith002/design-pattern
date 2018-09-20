package com.example.designpattern.observerpattern.eventdelegationmode;

import java.util.Date;

public class WatchingNBAListener {

    public WatchingNBAListener() {
        System.out.println("WatchingNBAListener 我正在看NBA,开始时间是：" + new Date());
    }

    public void stopWatchNBA(Date date) {
        System.out.println("WatchingNBAListener老师来了，快关闭NBA直播 ， 结束时间是：" + date);
    }
}
