/// iii - heranca - Monitor herda de ComponenteAvulso
public class Monitor extends ComponenteAvulso {
  /*
   * Atributos Privados -----------------------------
   * ii - encapsulamento
   */
  private double resolucao;

  public Monitor(String descricao, double resolucao, double preco) {
    super(descricao, preco);
    this.resolucao = resolucao;
  }

  /*
   * Métodos Protegidos -----------------------------
   * ii - encapsulamento
   */
  protected String nomeDaClasse() {
    return "Monitor";
  }
}
