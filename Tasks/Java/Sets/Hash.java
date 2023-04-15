package org.Tasks.Java.Sets;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        System.out.println(hashSet);

        Iterator<String> it = hashSet.iterator();
        while(it.hasNext()){
            String elem = it.next();
            System.out.println(elem);
            it.remove();
        }
        for(String elem: hashSet){
            hashSet.remove(elem);
            System.out.println(elem);
        }
    }
}
