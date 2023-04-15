package org.Tasks.Java.Map;

import java.util.HashMap;
import java.util.Map;

public class HMap {
    private Map<String, Integer> items = new HashMap<>();
    public void addItem(String item, int quantity){
        if(quantity < 0){
            throw new IllegalArgumentException("Quantity must be higher than or equal to 0");
        }
        if(item == null){
            throw new NullPointerException("Item cannot be null");
        }
        if(items.containsKey(item)){
            int q = items.get(item);
            items.put(item, q + quantity);
        }
        else{
            items.put(item, quantity);
        }
    }
    public void removeItem(String item, int quantity){
        if(item == null || quantity > items.get(item)){
            throw new IllegalArgumentException();
        }
        else if(items.get(item)- quantity > 0){
            int q = items.get(item);
            items.put(item, q-quantity);
        }
        else{
            items.remove(item);
        }
    }
    public int getQuantity(String item){
        if(item == null){
            throw new NullPointerException("Item cannot be null");
        }
        return items.getOrDefault(item, 0);
    }
    public void printInventory(){
        for(Map.Entry<String, Integer> entry: items.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }



}
