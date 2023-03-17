package loja;

public class ComponenteMontado extends Componente {
  Componente[] partes;
  int qtdPecas;

  public ComponenteMontado(){
    super();
    this.preco = 0;
    this.qtdPecas = 0;
  }

  public String toString(){
    String dados_proprios = super.toString();
    String dados_pecas = "Peças:" + System.lineSeparator();
    for(int i = 0; i < this.partes.length; i++){
      dados_pecas += "-" + this.partes[i].toString();
    }
    return dados_proprios + System.lineSeparator() + dados_pecas + System.lineSeparator();
  }

  public void inclui(Componente parte){
    atualizaPecas(parte);
    atualizaPreco(parte);
  }

  private void atualizaPecas(Componente parte){
    if(qtdPecas == 0) {
      this.partes = new Componente[1];
      partes[0] = parte;
      this.qtdPecas = 1;
    }
    else {
      this.qtdPecas += 1;
      Componente[] partesAtualizadas = new Componente[this.qtdPecas];
      System.arraycopy(this.partes, 0, partesAtualizadas, 0, this.partes.length);
      this.partes = partesAtualizadas;
      this.partes[qtdPecas-1] = parte;
    }
  }

  private void atualizaPreco(Componente parte){
    this.preco += parte.preco;
  }

}
