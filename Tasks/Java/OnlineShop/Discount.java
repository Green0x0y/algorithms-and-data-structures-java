package org.Tasks.Java.OnlineShop;

public class Discount {
    private String category;
    private double discountVal;
    Discount(String  category, double discountVal){
        this.discountVal = discountVal;
        this.category = category;
    }
    Discount(){

    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDiscountVal() {
        return discountVal;
    }

    public void setDiscountVal(double discountVal) {
        this.discountVal = discountVal;
    }
}
