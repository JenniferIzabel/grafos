/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Map;
import jdk.nashorn.internal.objects.Global;
import sun.misc.Queue;

/**
 *
 * @author jennifer
 */
public class BuscaLargura<V extends VerticeBuscaLargura> {

    private Map<String, ArrayList<V>> g;
    private VerticeBuscaLargura s;
    private Queue<V> q;
    private int infinito = 2147483647; //último número que cabe em um int

    public BuscaLargura(Map<String, ArrayList<V>> grafo) {
        this.g = grafo;
    }

    public BuscaLargura(Map<String, ArrayList<V>> grafo, VerticeBuscaLargura s) {
        this.g = grafo;
        this.s = s;
    }

    public void Init_BFS(Map<String, ArrayList<V>> g, V s) {
        int i = 0;
        for (Object u : g.keySet()) {
            if (!u.equals(s)) {
                g.get(u).get(i).setCor('W');
                g.get(u).get(i).setD(infinito);
                g.get(u).get(i).setPi(null);
            }
            i++;
        }
        s.setCor('G');
        s.setD(0);
        s.setPi(null);
        q.enqueue(s);
    }

    public void BFS(Map<String, ArrayList<V>> g, V s) throws InterruptedException {
        V u;
        int i = 0;
        while (!q.isEmpty()) {
            u = q.dequeue();
            for (Object v : g.keySet()) {
                if (g.get(v).get(i).getCor() == 'W') {
                    g.get(v).get(i).setCor('G');
                    g.get(v).get(i).setD(u.getD() + 1);
                    g.get(v).get(i).setPi(u);
                    i++;
                }
            }
            u.setCor('B');
        }
    }

}
