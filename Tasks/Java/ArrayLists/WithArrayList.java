package org.Tasks.Java.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class WithArrayList {
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<>();
        str.add("something");
        str.add(1,"aa");
        str.trimToSize();
    }
}
