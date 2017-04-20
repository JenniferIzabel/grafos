/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author jennifer
 */
public class Main {

        static Vertice vA = new Vertice("A");
        static Vertice vB = new Vertice("B");
        static Vertice vC = new Vertice("C");
        static Vertice vD = new Vertice("D");
        static Vertice vE = new Vertice("E");
        static Vertice[] lista = {vA, vB, vC, vD, vE};
    public static void main(String[] args) {

        //testaMatriz();
        testaListaAdjacencia();
    }
    
    public static void testaMatriz(){
        System.out.println("TESTE MATRIZ BEGIN");
        
        Matriz m = new Matriz(5, lista);
        System.out.println("CRIAÇÃO MATRIZ OK");
        
        m.adicionaAresta(0, 1);
        m.adicionaAresta(1, 2);
        m.adicionaAresta(1, 3);
        m.adicionaAresta(3, 4);
        m.adicionaAresta(2, 0);
        m.adicionaAresta(10, 10);
        System.out.println("ADICIONAR ARESTA OK");
        
        m.imprimeMatriz();
        System.out.println("IMPRIMIR MATRIZ OK");
        
        m.removeAresta(2, 0);
        m.removeAresta(7, 0);
        System.out.println("REMOVER ARESTA OK");
        
        m.imprimeMatriz();
        
        System.out.println("TESTE MATRIZ END");
        
    }
    
    public static void testaListaAdjacencia(){
        System.out.println("TESTE LISTA ADJACENCIA BEGIN");
        
        ListaAdjacencia le = new ListaAdjacencia(lista);
        System.out.println("CRIAR LISTA ADJACENCIA OK");
        
        Vertice vF = new Vertice("F");
        le.adicionarNovoVertice(vF);
        System.out.println("ADICIONAR NOVO VERTICE OK");

        le.adicionarArestas(vF, vA);
        System.out.println("ADICIONAR NOVA ARESTA OK");
        
        le.getGrafo().toString();
        System.out.println("IMPRIMIR GRAFO OK");
        
        
        
    }

}
