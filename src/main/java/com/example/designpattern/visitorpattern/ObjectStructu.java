package com.example.designpattern.visitorpattern;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructu {

    List<Element> elementList = new ArrayList<>();

    public void addElementList(Element element){
        elementList.add(element);
    }

    public void removeElementList(Element element){
        elementList.remove(element);
    }

    public void visitor(Visitor visitor){

        elementList.forEach(x -> x.accept(visitor));

    }

}
