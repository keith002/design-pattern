package com.example.designpattern.compositepattern;

import com.example.designpattern.factorymethodpattern.LeiFeng;

public class Leaf extends Component {

    public Leaf(String name){
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Cannot add to a leaf!");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Cannot remove to a leaf!");
    }

    @Override
    public void display(int depth) {
        System.out.println(StringUtil.print("-", depth) + " "+ name);
    }
}
