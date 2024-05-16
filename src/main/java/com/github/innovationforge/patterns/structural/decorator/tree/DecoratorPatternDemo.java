package com.github.innovationforge.patterns.structural.decorator.tree;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        ChristmasTree simpleTree = new SimpleChristmasTree();
        ChristmasTree decoratedTree1 = new GarlandDecorator(simpleTree);

        System.out.println("Decorated tree: " + decoratedTree1.decorate());

        ChristmasTree decoratedTree2 = new GarlandDecorator(new TinselDecorator(new BubbleLightsDecorator(simpleTree)));

        System.out.println("Decorated tree: " + decoratedTree2.decorate());
    }
}
