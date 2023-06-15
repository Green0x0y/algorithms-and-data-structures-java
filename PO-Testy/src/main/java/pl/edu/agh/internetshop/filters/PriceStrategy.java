package pl.edu.agh.internetshop.filters;

import pl.edu.agh.internetshop.Order;

import java.math.BigDecimal;

public class PriceStrategy implements Strategy{
    BigDecimal price;

    public PriceStrategy(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean filter(Order order) {
        return order.getPriceWithTaxes().compareTo(this.price) == 0;
    }
}
