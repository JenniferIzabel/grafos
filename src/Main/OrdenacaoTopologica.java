/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Rafael
 */
public class OrdenacaoTopologica<V extends VerticeBuscaProfundidade> {

    private int tempo;
    private Map<String, ArrayList<V>> grafo;
    LinkedList<V> lista = new LinkedList<V>();

    public LinkedList<V> topological_sort(Map<String, ArrayList<V>> g) {
        g = g;
        DFS();

        return lista;
    }

    private void DFS() {
        int i = 0;
        for (Object u : grafo.keySet()) {
            grafo.get(u).get(i).setCor('W');
            grafo.get(u).get(i).setPredecessor(null);
            i++;
        }
        tempo = 0;
        i = 0;
        for (Object u : grafo.keySet()) {
            if (grafo.get(u).get(i).getCor() == 'W') {
                BuscaProfundidade bp = new BuscaProfundidade(grafo, (V)u);
                bp.DFS_Visit(grafo, (V) u);
                lista.add((V)u);
            }
            i++;
        }
    }

}
