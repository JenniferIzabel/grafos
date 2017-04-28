/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;


/**
 *
 * @author jennifer
 */
public class BuscaLargura<V extends VerticeBuscaLargura> {

    private Map<String, ArrayList<V>> g;
    private V s;
    private Queue<V> q;
    private int infinito = 2147483647; //último número que cabe em um int

    public BuscaLargura(Map<String, ArrayList<V>> grafo) {
        this.g = grafo;
        
        Init_BFS(g, s);
        BFS(g, s);
    }

    public BuscaLargura(Map<String, ArrayList<V>> grafo, V s) {
        this.g = grafo;
        this.s = s;
        
        Init_BFS(g, s);
        BFS(g, s);
    }

    public void Init_BFS(Map<String, ArrayList<V>> g, V s) {
        int i = 0;
        for (Object u : g.keySet()) {
            if (!u.equals(s)) {
                g.get(u).get(i).setCor('W');
                g.get(u).get(i).setD(infinito);
                g.get(u).get(i).setPredecessor(null);
            }
            i++;
        }
        s.setCor('G');
        s.setD(0);
        s.setPredecessor(null);
        q.add(s);
    }

    public void BFS(Map<String, ArrayList<V>> g, V s) {
        V u;
        int i = 0;
        while (!q.isEmpty()) {
            u = q.poll();
            for (Object v : g.get(u)) {
                if (g.get(v).get(i).getCor()== 'W') {
                    g.get(v).get(i).setCor('G');
                    g.get(v).get(i).setD(u.getD() + 1);
                    g.get(v).get(i).setPredecessor(u);
                    i++;
                }
            }
            u.setCor('B');
        }
    }
    
    
    public void imprimeCaminho(Map<String, ArrayList<V>> g, V s, V v){
        if(v.equals(s)){
            System.out.println(s.getNome()+" -> ");
        }
        else{
            if(v == null){
                System.out.println("Não há caminho entre 's' e 'v'");
            }
            else{
                imprimeCaminho(g, s, (V)v.getPredecessor());
                System.out.println(v.getNome()+" -> ");
            }
        }
        
    }
}
