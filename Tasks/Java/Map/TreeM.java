package org.Tasks.Java.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeM {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 2);
        treeMap.put("Orange", 3);
        treeMap.put("Plum", 20);

        System.out.println(treeMap);
        if(treeMap.get("Apple")==null){
            throw new NullPointerException();
        }
        int val = treeMap.get("Apple");
        System.out.println(val);

        treeMap.remove("Aplle");
        System.out.println(treeMap);
        String firstK = treeMap.firstKey();
        System.out.println(firstK);
        System.out.println(treeMap.pollFirstEntry());
        for(Map.Entry<String, Integer> elem: treeMap.entrySet()){
            System.out.println(elem);
        }
        Iterator<Map.Entry<String,Integer>>iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }

}
