/// iii - heranca - Memoria herda de Placa
public class Memoria extends Placa {
  /*
   * Atributos Privados -----------------------------
   * ii - encapsulamento
   */
  private int capacidade;

  public Memoria(String descricao, int capacidade, double preco) {
    super(descricao, preco);
    this.capacidade = capacidade;
  }

  /*
   * Métodos Protegidos -----------------------------
   * ii - encapsulamento
   */
  protected String nomeDaClasse() {
    return "Memória";
  }
}
