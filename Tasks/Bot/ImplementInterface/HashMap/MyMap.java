package org.Tasks.Bot.ImplementInterface.HashMap;

import org.Tasks.Bot.ImplementInterface.HashMap.Mapa;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMap implements Mapa {
    Map<Point, Object> map = new HashMap<>();
    @Override
    public void addPoint(Point p, Object obj) throws IllegalArgumentException {
        if(obj == null || map.containsKey(p)){
            throw new IllegalArgumentException("Invalid Argument");
        }
        map.put(p, obj);
    }
    private int distance(Point p, Point q){
        return (int) Math.sqrt((p.x-q.x)^2 + (p.x-q.x)^2);
    }

    @Override
    public Object getNearest(Point p) {
        int min_val = Integer.MAX_VALUE;
        Point point = null;
        for(Map.Entry<Point, Object> elem : map.entrySet()){
            if (distance(p, elem.getKey()) < min_val){
                min_val = distance(p, elem.getKey());
                point = elem.getKey();
            }
        }
        return point;
    }

    @Override
    public List<Point> getPoints(Object obj) {
        if(obj == null){
            return null;
        }
        List<Point> points = new ArrayList<>();
        for(Map.Entry<Point, Object> elem : map.entrySet()){
            if(elem.getValue() == obj){
                points.add(elem.getKey());
            }
        }
        return points;
    }
}
