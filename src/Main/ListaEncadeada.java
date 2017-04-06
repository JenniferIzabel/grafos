/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jennifer
 */
public class ListaEncadeada<V extends Vertice> {

    private ArrayList<V> vertices = new ArrayList<V>();
    private V[] v; // lista de vertices passados por parametro

    private int initialSize;
    private double loadFactor = 0.75;
    private double sizeToRehash;
    private Map<String, ArrayList<V>> grafo = new HashMap<String, ArrayList<V>>();

    public ListaEncadeada(V[] v) {
        this.v = v;
        initialSize = v.length * 2;  // tamanho do Hash Map
        inicializaHashMap();
    }

    private void inicializaHashMap() {
        for (int i = 0; i < v.length; i++) {
            ArrayList<V> aux = new ArrayList<V>();
            aux.add(v[i]);
            grafo.put(v[i].getNome(), aux);
        }
    }

    public void adicionarNovoVertice(V ver) {
        ArrayList<V> aux = new ArrayList<V>();
        aux.add(ver);
        grafo.put(ver.getNome(), aux);
    }

    public void adicionarArestas(V v1, V v2) {
        ArrayList<V> posArray = grafo.get(v1);
        posArray.add(v2);
    }

    public void removerArestas(V v1, V v2) {
        ArrayList<V> posArray = grafo.get(v1);
        posArray.remove(v2);
    }

    public void removerVertice(V v1) {
        for (String key : grafo.keySet()) {
            ArrayList<V> value = grafo.get(key);
            for (V vertice : value) {
                if (vertice.equals(v1)) {
                    grafo.remove(key);
                }
            }
        }
    }

    public Map<String, ArrayList<V>> getGrafo() {
        return grafo;
    }
    
    
}
