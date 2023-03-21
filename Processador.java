/// iii - heranca - Processador herda de Placa
public class Processador extends Placa {

  public Processador(String descricao, double preco) {
    super(descricao, preco);
  }

  /*
   * Métodos Protegidos -----------------------------
   * ii - encapsulamento
   */
  protected String nomeDaClasse() {
    return "Processador";
  }
}
