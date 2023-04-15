package org.Tasks.Java.List2D;

import javax.sound.midi.InvalidMidiDataException;
import java.util.ArrayList;
import java.util.List;

public class List2D {
    private ArrayList<ArrayList<Integer>> map;
    public List2D(int n, int m){
        this.map = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            ArrayList<Integer> row = new ArrayList<>(m);
            for(int j = 0; j < m; j++){
                row.add(0);
            }
            map.add(row);
        }
    }
    public int getPlace(int x, int y){
        try{
            return map.get(x).get(y);
        } catch(IndexOutOfBoundsException e){
            System.out.println(" Nieprawidłowe pole ");
            return -1;
        }
    }
    public void setPlace(int x, int y  , int val ){
        try{
            map.get(x).set(y, val);
        } catch(IndexOutOfBoundsException e){
            System.out.println("Nieprawidłowe pole ");
        }

    }
}
