package org.Tasks.Generics.Boxes;

public class TestBoxGenerics {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();

        bookBox.addItem(new Book("HP", " JKR", 1));
        bookBox.addItem(new Book("AA", " BB", 1.5));

        System.out.println(bookBox.getLatestItem());
        System.out.println(bookBox);
        System.out.println(BoxUtils.getCountofItems(bookBox));
        System.out.println(bookBox.getTotalWeight());

        Box<Fruit> fruitBox = new Box<>();

        fruitBox.addItem(new Fruit("apple", "Poland", "Red", 0.3));

        System.out.println(fruitBox.getLatestItem());
        System.out.println(fruitBox);
        System.out.println(BoxUtils.getCountofItems(fruitBox));
        System.out.println(fruitBox.getTotalWeight());
    }
}
