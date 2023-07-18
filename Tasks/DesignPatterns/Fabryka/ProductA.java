package org.Tasks.DesignPatterns.Fabryka;

public class ProductA implements Product{

    @Override
    public void executeAction() {
        System.out.println("Action A");
    }
}
