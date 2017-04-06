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
public class Vertice {
    
    private String nome;
    private Vertice adjacente;
    
    // Atributos para Busca em largura
    private char cor = 'W'; // Todo vertice inicializa como White
    private int d; 
    private int pi;

    public Vertice() {
    }
    
    public Vertice(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Vertice getAdjacente() {
        return adjacente;
    }

    public void setAdjacente(Vertice adjacente) {
        this.adjacente = adjacente;
    }

    public char getCor() {
        return cor;
    }

    public void setCor(char cor) {
        this.cor = cor;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getPi() {
        return pi;
    }

    public void setPi(int pi) {
        this.pi = pi;
    }
    
    
    
    
    
    
}
