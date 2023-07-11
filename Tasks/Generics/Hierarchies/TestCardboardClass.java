package org.Tasks.Generics.Hierarchies;

import org.Tasks.Generics.Boxes.Box;
import org.Tasks.Generics.Boxes.Fruit;

public class TestCardboardClass {
    public static void main(String[] args) {
        CardboardBox<Fruit> cardboardFruitsBox = new CardboardBox<>();
        Box<Fruit> fruitsBox = new Box<>();
        fruitsBox = cardboardFruitsBox;

        Box<Apple> appleBox = new Box<>();
//        fruitBox = appleBox;

    }

}
