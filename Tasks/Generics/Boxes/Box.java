package org.Tasks.Generics.Boxes;

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

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }


}
