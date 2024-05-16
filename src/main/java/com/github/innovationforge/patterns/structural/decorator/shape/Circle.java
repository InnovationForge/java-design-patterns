package com.github.innovationforge.patterns.structural.decorator.shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}