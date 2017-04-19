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
public class VerticeBuscaProfundidade extends Vertice {
  private char cor; // Todo vertice inicializa como White
  private int d;
  private VerticeBuscaProfundidade predecessor;
  private int f;

  public int getF() {
      return f;
  }

  public void setF(int f) {
      this.f = f;
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

  public VerticeBuscaProfundidade getPredecessor() {
      return predecessor;
  }

  public void setPredecessor(VerticeBuscaProfundidade p) {
      this.predecessor = p;
  }
}
