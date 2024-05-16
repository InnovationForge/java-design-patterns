package com.github.innovationforge.patterns.structural.adapter.universalplug;

// Usage
public class UniversalPlugDemo {
    public static void main(String[] args) {
        AmericanPlug americanPlug = new AmericanPlug();
        UniversalPlug adapterA = new AmericanPlugAdapter(americanPlug);
        adapterA.connect();

        EuropeanPlug europeanPlug = new EuropeanPlug();
        UniversalPlug adapterE = new EuropeanPlugAdapter(europeanPlug);
        adapterE.connect();
    }
}