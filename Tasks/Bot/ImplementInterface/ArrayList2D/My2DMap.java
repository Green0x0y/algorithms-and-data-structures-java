package org.Tasks.Bot.ImplementInterface.ArrayList2D;

import java.util.ArrayList;
import java.util.List;

public class My2DMap implements TwoDimensionalList{
    List<List<Object>> map = new ArrayList<>();
    public void setSize(int x, int y){
        for( int i = 0 ; i < x; i++){
            map.add(new ArrayList<Object>(y));
        }
    }
    @Override
    public void setElement(int x, int y, Object element) throws IndexOutOfBoundsException {
        if( x  < 0 || y < 0 || x >= map.size() || y >= map.get(0).size()){
            throw new IndexOutOfBoundsException();
        }
        map.get(x).set(y, element);
    }

    @Override
    public Object getElement(int x, int y) throws IndexOutOfBoundsException {
        if( x  < 0 || y < 0 || x >= map.size() || y >= map.get(0).size()){
            throw new IndexOutOfBoundsException();
        }
        return map.get(x).get(y);
    }

    @Override
    public List<Object> getRow(int x) throws IndexOutOfBoundsException {
        if( x < 0 || x  > map.size()){
            throw new IndexOutOfBoundsException();
        }
        return map.get(x);
    }

    @Override
    public List<Object> getColumn(int y) throws IndexOutOfBoundsException {
        if( y < 0 || y  > map.size()){
            throw new IndexOutOfBoundsException();
        }
        List<Object> column = new ArrayList<>();
        for (List<Object> objects : map) {
            column.add(objects.get(y));
        }
        return column;
    }

    @Override
    public void addRow(List<Object> row) throws IllegalArgumentException {
        if(row.size() < map.get(0).size()){
            throw new IllegalArgumentException();
        }
        map.add(row);
    }

    @Override
    public void addColumn(List<Object> column) throws IllegalArgumentException {
        for(int i = 0; i < map.size(); i++){
            map.get(i).add(column.get(i));
        }
    }

    @Override
    public void removeRow(int x) throws IndexOutOfBoundsException {
        if( x < 0 || x  > map.size()){
            throw new IndexOutOfBoundsException();
        }
        map.remove(map.get(x));

    }

    @Override
    public void removeColumn(int y) throws IndexOutOfBoundsException {
        if( y < 0 || y  > map.get(0).size()){
            throw new IndexOutOfBoundsException();
        }
        for (List<Object> objects : map) {
            objects.remove(y);
        }
    }

    @Override
    public int getWidth() {
        return map.get(0).size();
    }

    @Override
    public int getHeight() {
        return map.size();
    }

    @Override
    public void clear() {
        map.clear();
    }
}
