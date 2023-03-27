package org.Tasks.Java.OnlineShop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Basket {
    private ArrayList<Product> products = new ArrayList<>();
    Basket(){

    }


    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public void printBasket(){
        products.forEach(p -> System.out.println(p.getName() + ": " + p.getPrice()));
    }
    public void calculateSum(){
        BigDecimal sumPrice = BigDecimal.ZERO;
        for(Product product:products){
            sumPrice = sumPrice.add(product.getPrice());
        }
        System.out.println( sumPrice);
    }


    public void makeDiscount(Discount discount) {
        for (Product product : products) {
            if (Objects.equals(product.getCategory(), discount.getCategory())) {
                product.setPrice(product.getPrice().multiply(BigDecimal.valueOf(1-discount.getDiscountVal())));
            }
        }
    }
}
