package loja;

public class Memoria extends Placa {
  int capacidade;

  public Memoria(String descricao, int capacidade, double preco){
    super(descricao, preco);
    this.capacidade = capacidade;
  }
}
