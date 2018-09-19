package com.example.designpattern.proxypattern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Proxy implements IGiveGift {

    Pursuit pp;

    @Override
    public void giveDolls() {
        pp.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pp.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pp.giveChocolate();
    }
}
