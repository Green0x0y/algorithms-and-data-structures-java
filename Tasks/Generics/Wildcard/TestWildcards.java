package org.Tasks.Generics.Wildcard;

import org.PrOb.Lab2.B;
import org.Tasks.Generics.Boxes.Book;
import org.Tasks.Generics.Boxes.Box;
import org.Tasks.Generics.Boxes.BoxUtils;
import org.Tasks.Generics.Boxes.Fruit;
import org.Tasks.Generics.Hierarchies.Apple;

public class TestWildcards {
    public static void main(String[] args) {
//        new Box<?>();
//        BoxUtils.emptyBox();
        Box<Book> bookBox = new Box<>();

        bookBox.addItem(new Book("HP", " JKR", 1));
        bookBox.addItem(new Book("AA", " BB", 1.5));
        System.out.println(BoxUtils.getCountofItems(bookBox));

        Box<Fruit> fruitBox = new Box<>();

        fruitBox.addItem(new Fruit("apple", "Poland", "Red", 0.3));
        fruitBox.addItem(new Fruit("banana", "Poland", "yellow", 0.4));

        System.out.println(Box.getAvarageWeightOfFruit(fruitBox));
        Box<Apple> appB = new Box<>();
        System.out.println(Box.getAvarageWeightOfFruit(appB));

        Box.addAppleToBox(appB);
        Box.addAppleToBox(fruitBox);
//        Box.addAppleToBox(bookBox);

    }
}
