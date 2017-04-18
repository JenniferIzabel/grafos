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
public class Matriz {
    private int ordemInicial;
    private Vertice[] listaVertices;
    private int matriz[][];

    public Matriz(int ordem, Vertice[] v) {
        this.ordemInicial = ordem;
        listaVertices = v;
        iniciaMatriz();
    }
    
    private void iniciaMatriz(){
        this.matriz = new int[][]{0};
        for (int i = 0; i < ordemInicial; i++) {
            for (int j = 0; j < ordemInicial; j++) {
                System.out.println(i+","+j);
                matriz[i][j] = 0;
            }
        }
    }
    
    public void adicionaAresta(int x, int y){
        matriz[x][y] = 1;
    }
    
     public void removeAresta(int x, int y){
        matriz[x][y] = 0;
    }
    
    public void imprimeMatriz(){
        for (int i = 0; i < ordemInicial; i++) {
            for (int j = 0; j < ordemInicial; j++) {
                System.out.print(matriz[i][j]+" , ");
            }
            System.out.print("\n");
        }
    }
    
    
}
