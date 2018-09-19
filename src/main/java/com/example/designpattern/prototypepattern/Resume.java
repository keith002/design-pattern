package com.example.designpattern.prototypepattern;

import lombok.Data;
import lombok.ToString;

import java.io.*;

@Data
@ToString
public class Resume implements Cloneable,Serializable {

    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        this.work = new WorkExperience();
    }

    public Resume(WorkExperience work) {
        this.work = work;
    }

    /**
     * 设置个人信息
     **/
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作年限
     */
    public void setWorkExperience(String workDate, String company) {
        this.work.setWorkDate(workDate);
        this.work.setCompany(company);
    }

    public Resume clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (Resume) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }
    }
    //使用序列化技术实现深克隆
    public Resume deepClone() {
        try {
            //将对象写入流中
            ByteArrayOutputStream bao;
            bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            //将对象从流中取出
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (Resume) ois.readObject();
        } catch (Exception e) {
            System.out.println("不支持复制！");
            return null;
        }
    }
}
