/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author rafael
 * 
 */
public class BuscaProfundidade<V extends VerticeBuscaProfundidade>  {

    private Map<String, ArrayList<V>> g;
    private V s;
    private int tempo = 0;

    
    
    public BuscaProfundidade(Map<String, ArrayList<V>> grafo, V s){
      this.g = grafo;
      this.s = s;
    }

    public void DFS(Map<String, ArrayList<V>> g){
      int i = 0;
      for (Object u : g.keySet()) {
        g.get(u).get(i).setCor('W');
        g.get(u).get(i).setPredecessor(null);
        i++;
      }
      tempo = 0;
      i = 0;
      for (Object u : g.keySet()) {
        if(g.get(u).get(i).getCor() == 'W'){
          DFS_Visit(g, (V)u);
        }
        i++;
      }
    }

    public void DFS_Visit(Map<String, ArrayList<V>> g, V u){
      tempo++;
      u.setD(tempo);
      u.setCor('G');
      int i = 0;
      for (Object v : g.get(u)) {
        if (g.get(v).get(i).getCor() == 'W') {
          g.get(v).get(i).setPredecessor(u);
          DFS_Visit(g, (V)v);
        }
      }
      u.setCor('B');
      tempo++;
      u.setF(tempo);
    }

}
