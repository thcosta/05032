package loja;

public class Componente {
  protected int codigo;
  protected double preco;
  protected String descricao;

  private static int ProximoCodigo = 1;

  public Componente() {
    this.codigo = Componente.ProximoCodigo;
    Componente.ProximoCodigo += 1;
  }

  public String toString() {
    return this.getClass().getName().replace("loja.", "") + " - Código  #"
        + this.codigo + " - " + this.descricao + " - R$ " + this.preco;
  }
}
