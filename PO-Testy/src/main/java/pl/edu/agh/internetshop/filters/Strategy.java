package pl.edu.agh.internetshop.filters;

import pl.edu.agh.internetshop.Order;

public interface Strategy {
    boolean filter(Order order);
}
