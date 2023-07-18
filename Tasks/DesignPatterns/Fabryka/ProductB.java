package org.Tasks.DesignPatterns.Fabryka;

public class ProductB implements Product{

    @Override
    public void executeAction() {
        System.out.println("Action B");
    }
}
