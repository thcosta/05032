/// iii - heranca - Computador herda de ComponenteMontado
public class Computador extends ComponenteMontado {

  public Computador(String descricao) {
    super(descricao);
  }

  // iv - polimorfismo: sobrescreve o método incluir de ComponenteMontado
  public void inclui(Componente parte) {
    if((parte instanceof Gabinete) || (parte instanceof Monitor)  || (parte instanceof Teclado)){
      super.inclui(parte);
    } else {
      System.out.println("Componente não é um Gabinete, Monitor ou Teclado!");
    }
  }

  /*
   * Métodos Protegidos -----------------------------
   * ii - encapsulamento
   */

  protected String nomeDaClasse() {
    return "Computador";
  }
}
