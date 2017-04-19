/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author rafael
 */
public class BuscaProfundidade<V extends VerticeBuscaLargura>  {

    private Map<String, ArrayList<V>> g;
    private VerticeBuscaLargura s;
    private int tempo = 0;

    public BuscaProfundidade((Map<String, ArrayList<V>> grafo, VerticeBuscaLargura s){
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
        if(u.getCor.equals('W')){
          DFS_Visit(g, u);
        }
        i++;
      }
    }

    public void DFS_Visit(Map<String, ArrayList<V>> g, VerticeBuscaLargura u){
      tempo++;
      u.setD(tempo);
      u.setCor('G');
      for (Object v : g.get(u)) {
        if (v.getCor().equals('W')) {
          g.get(v).get(i).setPredecessor(u);
          DFS_Visit(g, v);
        }
      }
      u.setCor('B');
      tempo++;
      u.setF(tempo);
    }

}
