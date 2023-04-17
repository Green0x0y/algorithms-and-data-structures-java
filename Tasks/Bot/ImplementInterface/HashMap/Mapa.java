package org.Tasks.Bot.ImplementInterface.HashMap;


import java.awt.*;
import java.util.List;
public interface Mapa {
    void addPoint(Point p, Object obj) throws IllegalArgumentException;
    Object getNearest(Point p);
    List<Point> getPoints(Object obj);
}
