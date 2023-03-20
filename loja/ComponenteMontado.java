package loja;

public class ComponenteMontado extends Componente {
  protected Componente[] partes;
  protected int qtdPecas;
  
  private static final int MAX_PECAS = 100_000;

  /*
   * Métodos Públicos -----------------------------
   */

  public ComponenteMontado(){
    super();
    this.preco = 0;
    this.partes = new Componente[ComponenteMontado.MAX_PECAS];
    this.qtdPecas = 0;
  }

  public void inclui(Componente parte){
    if(qtdPecas < MAX_PECAS){
      atualizaPecas(parte);
      atualizaPreco(parte);
    }
  }

  public String toString(){
    String dados_proprios = super.toString();
    if(this.qtdPecas > 0) {
      String dados_pecas = informacoesPecas();
      return dados_proprios + dados_pecas ;
    } else {
      return dados_proprios;
    }
  }

  /*
   * Métodos Públicos -----------------------------
   */

  private void atualizaPecas(Componente parte){
      this.partes[qtdPecas] = parte;
      this.qtdPecas += 1;
  }

  private void atualizaPreco(Componente parte){
    this.preco += parte.preco;
  }

  private String informacoesPecas() {
    String dados_pecas = " - Peças: { \n";
    for(int i = 0; i < this.qtdPecas; i++){
      dados_pecas += " " + this.partes[i].toString() + ", \n";
    }
    return dados_pecas + "}" ;
  }

}
