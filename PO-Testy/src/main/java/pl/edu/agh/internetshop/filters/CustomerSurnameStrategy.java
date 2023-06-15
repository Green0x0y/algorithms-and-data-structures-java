package pl.edu.agh.internetshop.filters;

import pl.edu.agh.internetshop.Order;

public class CustomerSurnameStrategy implements Strategy{
    private String payersSurname;

    public CustomerSurnameStrategy(String payersSurname) {
        this.payersSurname = payersSurname;
    }

    @Override
    public boolean filter(Order order) {
        if (order.getCustomerSurname() != null) {
            return order.getCustomerSurname().equals(this.payersSurname);
        }
        return false;
    }
}
