/// iii - heranca - Gabinete herda de ComponenteMontado
public class Gabinete extends ComponenteMontado {
    /*
   * Atributos Privados -----------------------------
   * ii - encapsulamento
   */
  private Placa[] partes; // iv - polimorfismo

  public Gabinete(String descricao){
    super(descricao);
  }

  // iv - polimorfismo: sobrescreve o método incluir de ComponenteMontado alterando o tipo do parâmetro
  public void inclui(Componente placa){
    if(placa instanceof Placa){
      super.inclui(placa);
    } else {
      System.out.println("Componente não é um Processador ou Memória");
    }
  }

  /*
   * Métodos Protegidos -----------------------------
   * ii - encapsulamento
   */
  protected String nomeDaClasse(){
    return "Gabinete";
  }
}
