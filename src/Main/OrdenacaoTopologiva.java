/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Rafael
 */
public class OrdenacaoTopologica<V extends VerticeBuscaProfundidade> {

  public LinkedList<V> topological_sort(Map<String, ArrayList<V>> g){
    LinkedList<V> lista = new LinkedList<V>();
    for (Object v : g.keySet ) {
      lista.add(g.get(v).get(i).setF(DFS(g)));
    }
    return lista;
  }

}
