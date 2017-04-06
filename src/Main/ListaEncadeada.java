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
public class ListaEncadeada {

    private ArrayList<Vertice> vertices = new ArrayList<Vertice>();
    private Vertice[] v; // lista de vertices passados por parametro

    private int initialSize;
    private double loadFactor = 0.75;
    private double sizeToRehash;
    private Map<String, ArrayList<Vertice>> grafo = new HashMap<String, ArrayList<Vertice>>();

    public ListaEncadeada(Vertice[] v) {
        this.v = v;
        initialSize = v.length * 2;  // tamanho do Hash Map
        inicializaHashMap();
    }

    private void inicializaHashMap() {
        for (int i = 0; i < v.length; i++) {
            ArrayList<Vertice> aux = new ArrayList<Vertice>();
            aux.add(v[i]);
            grafo.put(v[i].getNome(), aux);
        }
    }

    public void adicionarNovoVertice(Vertice ver) {
        ArrayList<Vertice> aux = new ArrayList<Vertice>();
        aux.add(ver);
        grafo.put(ver.getNome(), aux);
    }

    public void adicionarArestas(Vertice v1, Vertice v2) {
        ArrayList<Vertice> posArray = grafo.get(v1);
        posArray.add(v2);
    }

    public void removerArestas(Vertice v1, Vertice v2) {
        ArrayList<Vertice> posArray = grafo.get(v1);
        posArray.remove(v2);
    }

    public void removerVertice(Vertice v1) {
        for (String key : grafo.keySet()) {
            ArrayList<Vertice> value = grafo.get(key);
            for (Vertice vertice : value) {
                if (vertice.equals(v1)) {
                    grafo.remove(key);
                }
            }
        }
    }

    public Map<String, ArrayList<Vertice>> getGrafo() {
        return grafo;
    }
    
    
}
