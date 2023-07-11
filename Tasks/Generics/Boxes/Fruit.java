package org.Tasks.Generics.Boxes;

public class Fruit implements  Boxable{
    private String name;
    private String color;
    private double weight;

    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    private String countryOfOrigin;

    public Fruit(String name, String countryOfOrigin, String color, double weight) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.color = color;
        this.weight = weight;
    }


}
