package com.github.innovationforge.patterns.structural.decorator.tree;

public class GarlandDecorator extends TreeDecorator {
    public GarlandDecorator(ChristmasTree decoratedTree) {
        super(decoratedTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with garlands";
    }
}

// Similar decorators for tinsel and bubble lights
