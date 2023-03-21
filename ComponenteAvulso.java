// i - é uma abstração dos itens avulsos da loja
/// iii - heranca - ComponenteAvulso herda de Componente
class ComponenteAvulso extends Componente {

  // i - abstração: sobrescreve o construtor herdado de Componente para receber preço
  public ComponenteAvulso(String descricao, double preco){
    super(descricao);
    this.preco = preco;
  }
}
