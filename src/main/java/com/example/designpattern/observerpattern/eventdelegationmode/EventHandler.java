package com.example.designpattern.observerpattern.eventdelegationmode;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * class_name: EventHandler
 * package: com.example.designpattern.observerpattern.eventdelegationmode
 * describe: 事件的 处理着
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/20
 * creat_time: 14:53
 **/
public class EventHandler {

    private List<Event> objects;

    public EventHandler(){
        objects = new ArrayList<>();
    }

    /**
     * class_name:
     * param:
     * describe: 添加某个对象要执行的事件，及需要的参数
     * creat_user: Keith002@sina.com
     * creat_date: 2018/9/20
     * creat_time: 15:30
     **/
    public void addEvent(Object object, String methodName, Object ...args){
        objects.add(new Event(object,methodName,args));
    }

    /**
     * class_name:
     * param:
     * describe: 通知所有得对象执行指定的事件
     * creat_user: Keith002@sina.com
     * creat_date: 2018/9/20
     * creat_time: 15:30
     **/
    public void notityX(){
        objects.forEach(e -> {
            try {
                e.invoke();
            } catch (NoSuchMethodException e1) {
                e1.printStackTrace();
            } catch (InvocationTargetException e1) {
                e1.printStackTrace();
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            }
        });
    }

}
