package org.Tasks.Generics.Boxes;

public class Book implements Boxable{
    private String name;
    private String author;
    private double weight;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Book(String name, String author, double weight) {
        this.name = name;
        this.author = author;
        this.weight = weight;
    }

    public String getAuthor() {
        return author;
    }

    public double getWeight() {
        return weight;
    }
}
