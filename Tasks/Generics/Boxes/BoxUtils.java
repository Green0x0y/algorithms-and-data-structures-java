package org.Tasks.Generics.Boxes;

public class BoxUtils {
    public static  <T extends Boxable> int getCountofItems(Box<T> box){
        return box.getItems().size();

    }
}
