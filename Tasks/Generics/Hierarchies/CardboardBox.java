package org.Tasks.Generics.Hierarchies;

import org.Tasks.Generics.Boxes.Box;
import org.Tasks.Generics.Boxes.Boxable;

public class CardboardBox<T extends Boxable> extends Box<T> {
    @Override
    public double getTotalWeight(){
        return super.getTotalWeight() + 0.1;
    }
}
