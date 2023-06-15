package pl.edu.agh.internetshop.filters;

import pl.edu.agh.internetshop.Order;
import pl.edu.agh.internetshop.Product;

import java.util.List;

public class ProductNameStrategy implements Strategy {
    private String name;

    public ProductNameStrategy(String name) {
        this.name = name;
    }

    @Override
    public boolean filter(Order order) {
        List<Product> products = order.getProducts();
        for (Product product: products) {
            if (product.getName().equals(this.name)) {
                return true;
            }
        }
        return false;
    }
}
