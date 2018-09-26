package com.example.designpattern.compositepattern;

public class Compositepattern {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite composite = new Composite("Composite X");
        composite.add(new Leaf("Leaf XA"));
        composite.add(new Leaf("Leaf XB"));

        root.add(composite);

        Composite composite2 = new Composite("Composite XX");
        composite2.add(new Leaf("Leaf XXA"));
        composite2.add(new Leaf("Leaf XXB"));

        composite.add(composite2);

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
