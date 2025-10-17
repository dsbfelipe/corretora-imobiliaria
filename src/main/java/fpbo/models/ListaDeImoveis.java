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

  public List<Imovel> listar() {
    return new ArrayList<>(imoveis);
  }

  public List<Imovel> listarAlugados() {
    return imoveis.stream().filter(imovel -> imovel.isAlugado()).toList();
  }

  public List<Imovel> listarDisponiveis() {
    return imoveis.stream().filter(imovel -> !imovel.isAlugado()).toList();
  }
}

