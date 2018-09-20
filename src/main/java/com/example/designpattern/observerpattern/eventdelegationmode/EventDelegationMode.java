package com.example.designpattern.observerpattern.eventdelegationmode;

import java.util.Date;

public class EventDelegationMode {
    public static void main(String[] args) throws InterruptedException {
        //
        Notifier goodNotifer = new GoodNotifer();

        WatchingNBAListener watchingNBAListener = new WatchingNBAListener();
        WeGameListener weGameListener = new WeGameListener();

        goodNotifer.addListener(watchingNBAListener,"stopWatchNBA",new Date());
        goodNotifer.addListener(weGameListener,"stopWeGame",new Date());

        Thread.sleep(5000);

        goodNotifer.notifyX();
    }
}
