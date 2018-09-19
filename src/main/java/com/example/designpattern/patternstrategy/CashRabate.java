package com.example.designpattern.patternstrategy;

import lombok.Data;

@Data
public class CashRabate extends CashSuper {

    private Double rebate;

    public CashRabate(Double rebate){
        this.rebate = rebate;
    }

    @Override
    public Double acceptCash() {
        return super.money * rebate;
    }
}
