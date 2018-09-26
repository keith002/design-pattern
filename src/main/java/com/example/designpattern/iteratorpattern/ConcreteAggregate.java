package com.example.designpattern.iteratorpattern;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<>();
    public int count = 0;

    @Override
    public Iterable createIterator() {
        return new ConcreteIterator(this);
    }

    public Object get(int index){
        return items.get(index);
    }

    public void set(Object value){
        items.add(value);
        count++;
    }

}
