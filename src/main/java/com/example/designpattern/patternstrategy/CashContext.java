package com.example.designpattern.patternstrategy;

import lombok.Getter;
import lombok.Setter;

/**
 * class_name: CashContext
 * package: com.example.designpattern.patternstrategy
 * describe: TODO
 * creat_user: Keith002@sina.com
 * creat_date: 2018/9/18
 * creat_time: 15:04
 **/
@Getter
@Setter
public class CashContext {

    public CashContext(){

    }

    CashSuper cs = null;

    public CashContext(String type){
        switch(type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300 返 100":
                cs = new CashReturn(300d, 100d);
                break;
            case "打 8 折":
                cs = new CashRabate(0.8);
                break;
        }
    }
}
