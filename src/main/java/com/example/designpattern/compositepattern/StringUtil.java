package com.example.designpattern.compositepattern;

public class StringUtil {
    /**
     * class_name: 复制字符串 并拼接
     * param:
     * describe: TODO
     * creat_user: Keith002@sina.com
     * creat_date: 2018/9/26
     * creat_time: 16:13
     **/
    public static String print(String str, int depth){
        StringBuilder buf = new StringBuilder();
        for (int a = 0; a <= depth ;a++){
            buf.append(str);
        }
        return buf.toString();
    }

}
