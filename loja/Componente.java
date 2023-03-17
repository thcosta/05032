package loja;

public class Componente {
  int codigo;
  double preco;
  String descricao;

  static int ProximoCodigo = 1;

  public Componente(){
    this.codigo = Componente.ProximoCodigo;
    Componente.ProximoCodigo += 1;
  } 
  
  public String toString(){
    return "ID #" + this.codigo + " - " + this.descricao + " - R$ " + this.preco;
  }
}
