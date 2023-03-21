/// iii - heranca - Teclado herda de ComponenteAvulso
public class Teclado extends ComponenteAvulso {

  public Teclado(String descricao, double preco) {
    super(descricao, preco);
  }

  /*
   * Métodos Protegidos -----------------------------
   * ii - encapsulamento
   */
  protected String nomeDaClasse() {
    return "Teclado";
  }
}
