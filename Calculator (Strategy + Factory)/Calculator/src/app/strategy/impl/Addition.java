package app.strategy.impl;

import app.strategy.Operation;

public class Addition implements Operation {

    @Override
    public int calculate(int a, int b) {

        return a+b;
    }
    
}