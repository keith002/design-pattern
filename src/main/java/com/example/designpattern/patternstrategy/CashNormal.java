package com.example.designpattern.patternstrategy;

import lombok.Data;

@Data
public class CashNormal extends CashSuper {

    @Override
    public Double acceptCash() {
        return super.money;
    }
}
