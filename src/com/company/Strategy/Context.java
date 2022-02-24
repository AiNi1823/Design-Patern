package com.company.Strategy;

import java.util.concurrent.locks.Condition;

public class Context {

    PayStrategy payStrategy;

    public Context(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void algorithmInterface() {
        payStrategy.algorithmInterface();
    }
}
