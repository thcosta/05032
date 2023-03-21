// i - é uma abstração de todos os itens da loja
public class Componente {
  /*
   * Atributos Protegidos -----------------------------
   * ii - encapsulamento
   */
  protected int codigo;
  protected double preco;
  protected String descricao;

  /*
   * Atributos Privados -----------------------------
   * ii - encapsulamento
   */
  private static int ProximoCodigo = 1;

  /*
   * Métodos Protegidos -----------------------------
   * // ii - encapsulamento
   */
  // i - abstração: outras classes sobrescrevem esse método
  protected String nomeDaClasse() {
    return "Componente";
  }

  /*
   * Métodos Públicos -----------------------------
   */

  public Componente(String descricao) {
    this.descricao = descricao;
    this.codigo = Componente.ProximoCodigo;
    Componente.ProximoCodigo += 1;
  }

  public String toString() {
    return nomeDaClasse() + " - Código  #"
        + this.codigo + " - " + this.descricao + " - R$ " + this.preco;
  }
}
