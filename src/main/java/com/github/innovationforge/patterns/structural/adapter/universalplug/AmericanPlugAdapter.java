package com.github.innovationforge.patterns.structural.adapter.universalplug;

// Adapter for American plug
class AmericanPlugAdapter implements UniversalPlug {
    private final AmericanPlug americanPlug;

    AmericanPlugAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void connect() {
        americanPlug.plugInAmericanSocket();
    }
}