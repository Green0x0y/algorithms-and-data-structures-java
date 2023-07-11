package org.Tasks.Generics.Boxes;

import org.Tasks.Generics.Hierarchies.Apple;

import java.util.Collections;

import static java.util.Collections.emptyList;

public class TestTypeInterface {
    public static void main(String[] args) {
        //type witness demo
//        var Collections.emptyList();
        Number num = pickOne(12,23.34);
        Fruit fruit = new Fruit("mango", "poland", "orange",1.23);
        Apple apple = new Apple("apple", "poland", "red",1.3);

        Fruit fr = pickOne(fruit,apple);

        Box<Fruit> fb = new Box<>();

        var box = Box.of(fruit);
        var anotherBox = Box.of(apple);

        Box<Fruit> box1 = BoxUtils.emptyBox();
    }
    public static <T> T pickOne(T t1, T t2){
        if(Math.random()>0.5){
            return t1;
        }
        return t2;
    }
}
