package loja;

public class Monitor extends ComponenteAvulso {
  double resolucao;

  public Monitor(String descricao, double resolucao, double preco){
    super(descricao, preco);
    this.resolucao = resolucao;
  }
}
