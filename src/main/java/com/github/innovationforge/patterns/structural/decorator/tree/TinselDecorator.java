package com.github.innovationforge.patterns.structural.decorator.tree;

public class TinselDecorator extends TreeDecorator {
    public TinselDecorator(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithTinsel();
    }

    private String decorateWithTinsel() {
        return " with Tinsel";
    }
}
