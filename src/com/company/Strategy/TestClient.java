package com.company.Strategy;

public class TestClient {
    public static void main(String[] args) {
        Context context;
        context = new Context(new PayStrategyWx());
        context.algorithmInterface();
        context = new Context(new PayStrategyAli());
        context.algorithmInterface();
    }
}
