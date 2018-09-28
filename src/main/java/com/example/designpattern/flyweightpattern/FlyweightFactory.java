package com.example.designpattern.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> map = new HashMap<>();

    public FlyweightFactory(){
        map.put("X", new ConcreteFlyweight());
        map.put("Y", new ConcreteFlyweight());
        map.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return map.get(key);
    }

}
