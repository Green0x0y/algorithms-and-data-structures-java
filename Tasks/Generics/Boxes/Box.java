package org.Tasks.Generics.Boxes;

import org.PrOb.Lab2.A;
import org.Tasks.Generics.Hierarchies.Apple;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Boxable> {
    private List<T> items;
    public Box(){
        this.items = new ArrayList<>();
    }
    public double getTotalWeight(){
        return this.items.stream().mapToDouble(Boxable::getWeight).sum();
    }
    public void addItem(T t){
        this.items.add(t);
    }
    public T getLatestItem(){
        return this.items.get(items.size()-1);
    }

    public List<T> getItems() {
        return items;
    }

    public static<T extends Boxable> Box<T> of(T t){
        Box<T> box = new Box<>();
        box.addItem(t);
        return box;
    }
    public static double getAvarageWeightOfFruit(Box<? extends Fruit> box){
        return box.getItems().stream().mapToDouble(Boxable::getWeight).sum()/box.getItems().size();
    }
    public static void addAppleToBox(Box<? super Apple> box){
        box.addItem(new Apple("orange", "orange", "germany", 0.24));

    }
    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }


}
