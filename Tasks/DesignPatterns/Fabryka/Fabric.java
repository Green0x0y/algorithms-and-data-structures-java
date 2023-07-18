package org.Tasks.DesignPatterns.Fabryka;

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
