package com.github.innovationforge.patterns.structural.decorator.tree;

public class BubbleLightsDecorator extends TreeDecorator {
    public BubbleLightsDecorator(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
