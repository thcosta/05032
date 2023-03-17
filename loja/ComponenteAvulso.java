package loja;

public class ComponenteAvulso extends Componente {

  public ComponenteAvulso(String descricao, double preco){
    super();
    this.descricao = descricao;
    this.preco = preco;
  }

  public String toString(){
    return "ID #" + this.codigo + " - " + this.descricao + " - R$ " + this.preco + System.lineSeparator();
  }
}
