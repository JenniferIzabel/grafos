/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Map;
import javafx.scene.paint.Color;
import jdk.nashorn.internal.objects.Global;
import sun.misc.Queue;

/**
 *
 * @author jennifer
 */
public class BuscaLargura {

    private Map<String, ArrayList<Vertice>> g;
    private Vertice s;
    private Queue<Vertice> q;
    private int infinito = 2147483647; //último número que cabe em um int

    public BuscaLargura(Map<String, ArrayList<Vertice>> grafo) {
        this.g = grafo;
    }

    public BuscaLargura(Map<String, ArrayList<Vertice>> grafo, Vertice s) {
        this.g = grafo;
        this.s = s;
    }

    public void Init_BFS(Map<String, ArrayList<Vertice>> g, Vertice s) {
        for (Object key : g.keySet()) {
            if (key.equals(s)) {
                s.setCor('W');
                s.setD(infinito);
                s.setPi(null);
            }
        }
        s.setCor('G');
        s.setD(0);
        s.setPi(null);
        q = 0;
        Enqueue(q,s);
    }

}
