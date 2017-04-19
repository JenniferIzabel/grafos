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
public class VerticeBuscaLargura extends Vertice{
    // Atributos para Busca em largura
    private char cor; // Todo vertice inicializa como White
    private int d;
    private VerticeBuscaLargura predecessor;



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

    public VerticeBuscaLargura getPredecessor() {
        return pi;
    }

    public void setPredecessor(VerticeBuscaLargura p) {
        this.predecessor = p;
    }

}
