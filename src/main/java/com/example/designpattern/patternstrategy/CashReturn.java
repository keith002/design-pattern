package com.example.designpattern.patternstrategy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CashReturn extends CashSuper {

    private Double moneyCondition;
    private Double moneyReturn;

    public CashReturn(Double moneyCondition, Double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public Double acceptCash() {
        if(money > moneyCondition){
            money = super.money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return money;
    }
}
