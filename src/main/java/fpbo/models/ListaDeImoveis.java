package fpbo.models;

import java.util.ArrayList;
import java.util.List;

public class ListaDeImoveis {
  private final List<Imovel> imoveis;

  public ListaDeImoveis() {
    this.imoveis = new ArrayList<>();
  }

  public void adicionar(Imovel imovel) {
    imoveis.add(imovel);
  }

  public List<Imovel> getImoveis() {
    return new ArrayList<>(imoveis);
  }
}
