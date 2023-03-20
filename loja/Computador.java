package loja;

public class Computador extends ComponenteMontado {
  
  public Computador(String descricao) {
    this.descricao = descricao;
  }

  public void inclui(Componente componente) {
    super.inclui(componente);
  }
}
