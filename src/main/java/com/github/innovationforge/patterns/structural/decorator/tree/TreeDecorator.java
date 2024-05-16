package com.github.innovationforge.patterns.structural.decorator.tree;

public abstract class TreeDecorator implements ChristmasTree {
    protected ChristmasTree decoratedTree;

    public TreeDecorator(ChristmasTree decoratedTree) {
        this.decoratedTree = decoratedTree;
    }

    @Override
    public String decorate() {
        return decoratedTree.decorate();
    }
}
