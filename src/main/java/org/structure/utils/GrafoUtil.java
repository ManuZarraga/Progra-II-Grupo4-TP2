package main.java.org.structure.utils;

import main.java.org.structure.definition.GraphADT;
import main.java.org.structure.definition.Set2ADT;

public class GrafoUtil {

    public static void dfs(GraphADT grafo, String origen, String destino ){
        boolean[] visited = new boolean[50];
        String[] vertices = new String[50];
        Set2ADT set = grafo.getVertxs();
        if (set.exist(origen) && set.exist(destino)){
            dfsRecursivo(grafo, 0, origen, destino, visited, vertices);
        }
    }

    private static void dfsRecursivo(GraphADT grafo, int posicion, String origen, String destino, boolean[] visited, String[] vertices){
        vertices[posicion] = origen;
        visited[posicion] = true;
        posicion++;
        if (origen == destino){
            System.out.print("Vertices visitados: ");
            for (int i = 0; i < posicion; i++){
                System.out.println(vertices[i]);
            }
        }
        else {
            Set2ADT set = grafo.getVertxs();
            while (!set.isEmpty()){
                String aux = set.choose();
                set.remove(aux);
                if (grafo.existsEdge(origen, aux)){
                    dfsRecursivo(grafo, posicion, aux, destino, visited, vertices);
                }
            }
        }
    }
}
