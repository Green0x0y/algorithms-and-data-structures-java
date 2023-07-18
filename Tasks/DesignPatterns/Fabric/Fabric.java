package org.Tasks.DesignPatterns.Fabric;

public class Fabric {
    public Product newProduct(String type){
        if (type.equals("A")){
            return new ProductA();
        } else if (type.equals("B")){
            return new ProductB();
        } else{
            return null;
        }
    }
}
