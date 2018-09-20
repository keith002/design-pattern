package com.example.designpattern.observerpattern.eventdelegationmode;

/**
 * class_name: Notifier
 * package: com.example.designpattern.observerpattern.eventdelegationmode
 * describe: 通知者的 抽象类
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/20
 * creat_time: 14:51
 **/
public abstract class Notifier {

    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    /**
     * class_name:
     * param:
     * describe: 增加需要帮忙 放哨的学生
     * creat_user: Keith002@sina.com
     * creat_date: 2018/9/20
     * creat_time: 15:33
     **/
    public abstract void addListener(Object object, String methodName, Object... args);

    /**
     * class_name:
     * param:
     * describe: 告诉所有要帮忙放哨的学生：老师来了
     * creat_user: Keith002@sina.com
     * creat_date: 2018/9/20
     * creat_time: 15:34
     **/
    public abstract void notifyX();
}
