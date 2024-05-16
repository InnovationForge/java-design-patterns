package com.github.innovationforge.patterns.structural.adapter.universalplug;

// Adapter for European plug
class EuropeanPlugAdapter implements UniversalPlug {
    private final EuropeanPlug europeanPlug;

    EuropeanPlugAdapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void connect() {
        europeanPlug.plugInEuropeanSocket();
    }
}