package org.Tasks.Java.File.List2D;

import com.sun.security.jgss.InquireType;

import java.util.HashMap;
import java.util.Map;

public class Map2D {
    private Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
    public void setPlace(int x, int y, int val){
        Map<Integer,Integer> row = new HashMap<>();
        if(row == null){
            row = new HashMap<>();
            map.put(x, row);
        }
        row.put(y,val);
    }
    public Integer getPlace(int x, int y){
        Map<Integer, Integer> row = map.get(x);
        if(row == null){
            return null;
        }
        try{
            return row.get(y);
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
