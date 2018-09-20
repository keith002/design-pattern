package com.example.designpattern.observerpattern.eventdelegationmode;

public class GoodNotifer extends Notifier {
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新学生委托尽职尽责的放哨人");
        EventHandler eventHandler = this.getEventHandler();
        eventHandler.addEvent(object, methodName, args);
    }

    @Override
    public void notifyX() {
        System.out.println("尽职尽责的放哨人告诉所有需要帮忙的同学：老师来了");
        this.getEventHandler().notityX();
    }
}
