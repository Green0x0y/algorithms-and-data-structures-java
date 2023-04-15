package org.Tasks.Java.List2D;

import java.util.ArrayList;

public class Array2D {
    private int[][] map;
    public Array2D(int n, int m){
        this.map = new int[n][m];
        for(int i = 0; i< n; i++){
            for(int j = 0; j < m; j++){
                this.map[i][j] = 0;
            }
        }
    }
    public int getValue(int x, int y){
        if( x < 0 || y < 0 || x >= map.length || y >map[0].length){
            throw new IllegalArgumentException();
        }
        return map[x][y];
    }
    public void setValue(int val, int x, int y){
        if( x < 0 || y < 0 || x >= map.length || y >map[0].length){
            throw new IllegalArgumentException();
        }
        map[x][y] = val;
    }

}
