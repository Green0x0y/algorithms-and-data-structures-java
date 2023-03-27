package org.Tasks.Java.OnlineShop;

import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("ser", BigDecimal.valueOf(2.23), "żywność");
        Product product2 = new Product("piłka", BigDecimal.valueOf(123), "zabawki");
        Basket basket = new Basket();
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.calculateSum();
        Discount discount = new Discount("żywność", 0.1);
        basket.makeDiscount(discount);
        basket.calculateSum();
        basket.printBasket();
    }

}

