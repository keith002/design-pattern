package com.example.designpattern.observerpattern.eventdelegationmode;

import lombok.Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * class_name: Event
 * package: com.example.designpattern.observerpattern.eventdelegationmode
 * describe: 事件对象的封装类
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/20
 * creat_time: 14:55
 **/
@Data
public class Event {
    /**
     * 要执行方法的对象
     */
    private Object object;
    /**
     * 要执行的方法名称
     */
    private String methodName;
    /**
     * 要执行的方法参数
     */
    private Object[] params;
    /**
     * 要执行的方法参数类型
     */
    private Class[] paramsType;

    public Event() {

    }

    public Event(Object object, String methodName, Object... args) {
        this.object = object;
        this.methodName = methodName;
        this.params = args;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object[] params) {
        this.paramsType = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramsType[i] = params[i].getClass();
        }
    }

    public Object getObject() {
        return object;
    }
    /**
     * class_name: Event.class
     * param:
     * describe: 根据该对象的方法名，方法参数，利用反射机制，执行该方法
     * creat_user: Keith002@sina.com
     * creat_date: 2018/9/20
     * creat_time: 15:26
     **/
    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = object.getClass().getMethod(this.getMethodName(), this.getParamsType());
        if(null == method){
            return;
        }
        method.invoke(this.getObject(), this.getParams());
    }

}
