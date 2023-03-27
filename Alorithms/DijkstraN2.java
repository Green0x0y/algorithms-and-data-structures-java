package org.Alorithms;

import java.lang.*;

public class DijkstraN2 {
    int minDist(int[] dist, Boolean[] visited, int vertices){
        int min = Integer.MAX_VALUE;
        int min_index = 1;
        for(int v =0; v < vertices; v++){
            if(!visited[v] && dist[v] <=min){
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }
    void printSolution(int[] dist, int vertices)
    {
        System.out.println(
                "Vertex \t\t Distance from Source");
        for (int i = 0; i < vertices; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }
    void dijkstra(int[][] graph, int src, int vertices) {
        int[] dist = new int[vertices];
        Boolean[] visited = new Boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;

        }
        dist[src] = 0;
        for (int count = 0; count < vertices - 1; count++) {
            int u = minDist(dist, visited, vertices);
            visited[u] = true;
            for (int v = 0; v < vertices; v++)


                if (!visited[v] && graph[u][v] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
        printSolution(dist, vertices);
    }


    public static void main(String[] args)
    {

        int[][] graph
                = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        DijkstraN2 t = new DijkstraN2();

        t.dijkstra(graph, 0, 9);

    }
}
