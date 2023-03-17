package loja;

public class Gabinete extends ComponenteMontado {
  Placa[] partes;

  public Gabinete(String descricao){
    super();
    this.descricao = descricao;
  }

  public void inclui(Placa placa){
    super.inclui(placa);
  }

  public String toString(){
    return super.toString();
  }
}
