/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

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
        boolean b = true;
        while (b) {
            int op;
            System.out.println("O que vc deseja testar:"
                    + "\n1 - grafo em matriz"
                    + "\n2 - grafo em lista"
                    + "\n3 - busca em largura"
                    + "\n4 - busca em profundidade"
                    + "\n5 - ordenação topológica"
                    + "\n6 - componentes conexas"
                    + "\n0 - SAIR");
            
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();
            switch(op){
                case(1): 
                    testaGrafoMatrizAdjacencia(); 
                    System.out.println("\n------------------------------------\n");
                    break;
                case(2):
                    testaGrafoListaAdjacencia();
                    System.out.println("\n------------------------------------\n");
                    break;
                case(3):
                    testaBuscaLargura();
                    System.out.println("\n------------------------------------\n");
                    break;
                case(4):
                    testaBuscaProfundidade();
                    System.out.println("\n------------------------------------\n");
                    break;
                case(5):
                    testaOrdenacaoTopologica();
                    System.out.println("\n------------------------------------\n");
                    break;
                case(6):
                    testaComponenteConexa();
                    System.out.println("\n------------------------------------\n");
                    break;
                case(0):
                    System.out.println("\n------------------------------------\n");
                    b = false;
                    break;
                default:
                    System.out.println("\n------------------------------------\n");
                    System.out.println("OPÇÃO INVÁLIDA!! Digite novamente:\n");
                    continue;
            }
        }
    }

    public static void testaGrafoMatrizAdjacencia() {
        System.out.println("TESTE GRAFO MATRIZ ADJACENCIA BEGIN");

        GrafoMatrizAdjacencia m = new GrafoMatrizAdjacencia(5, lista);
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

        System.out.println("TESTE GRAFO MATRIZ ADJACENCIA END");
    }

    public static void testaGrafoListaAdjacencia() {
        System.out.println("TESTE GRAFO LISTA ADJACENCIA BEGIN");

        GrafoListaAdjacencia le = new GrafoListaAdjacencia(lista);
        System.out.println("CRIAR GRAFO LISTA ADJACENCIA OK");

        Vertice vF = new Vertice("F");
        le.adicionarNovoVertice(vF);
        System.out.println("ADICIONAR NOVO VERTICE OK");

        le.adicionaAresta(vA, vB);
        le.adicionaAresta(vB, vC);
        le.adicionaAresta(vB, vD);
        le.adicionaAresta(vD, vE);
        le.adicionaAresta(vC, vA);
        le.adicionaAresta(vF, vA);
        System.out.println("ADICIONAR NOVA ARESTA OK");

        le.imrimeGrafo();
        System.out.println("IMPRIMIR O GRAFO OK");

        System.out.println("TESTE GRAFO LISTA ADJACENCIA END");
    }

    public static void testaBuscaLargura() {
        System.out.println("TESTE BUSCA LARGURA BEGIN");
        
        
        System.out.println("TESTE BUSCA LARGURA END");
    }
    
    public static void testaBuscaProfundidade() {
        System.out.println("TESTE BUSCA PROFUNDIDADE BEGIN");

        System.out.println("TESTE BUSCA PROFUNDIDADE END");
    }
    
    public static void testaOrdenacaoTopologica() {
        System.out.println("TESTE ORDENACAO TOPOLOGICA BEGIN");

        System.out.println("TESTE ORDENACAO TOPOLOGICA END");
    }
    
    public static void testaComponenteConexa() {
        System.out.println("TESTE COMPONENTE CONEXA BEGIN");

        System.out.println("TESTE COMPONENTE CONEXA END");
    }
}
