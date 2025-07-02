package main.java.org.structure.utils;

import main.java.org.structure.definition.GraphADT;
import main.java.org.structure.definition.Set2ADT;
import main.java.org.structure.fixed.StaticSetADT;

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

    public static void rutasNoUtilizadas(GraphADT grafo){
        Set2ADT set = grafo.getVertxs();
        Set2ADT emptySet = new StaticSetADT();
        while (!set.isEmpty()){
            String aux = set.choose();
            set.remove(aux);

            Set2ADT set2 = grafo.getVertxs();
            boolean isEmpty = false;
            while (!set2.isEmpty()){
                String aux2 = set2.choose();
                set2.remove(aux2);

                if(grafo.existsEdge(aux2, aux) || grafo.existsEdge(aux, aux2)){
                    isEmpty = true;
                    break;
                }
            }
            if(!isEmpty){
                emptySet.add(aux);
            }
        }

        while (!emptySet.isEmpty()){
            String aux = emptySet.choose();
            emptySet.remove(aux);
            System.out.print(aux);
        }
    }
}
