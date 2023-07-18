package org.Tasks.DesignPatterns.Fabryka;

public class Main {
    public static void main(String[] args) {
        Fabric fab = new Fabric();

        Product productA = fab.newProduct("A");
        Product productB = fab.newProduct("B");

        productA.executeAction();
        productB.executeAction();
    }
}
