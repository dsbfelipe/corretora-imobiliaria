package fpbo.models;

import java.util.ArrayList;
import java.util.List;

public class ListaDeImoveis {
  private final List<Imovel> imoveis;

  public ListaDeImoveis() {
    this.imoveis = new ArrayList<>();

    Proprietario felipe = new Proprietario("Felipe Bento", "11999999999", "123.456.789-00");
    Proprietario lauri = new Proprietario("Lauri Ellen", "11988888888", "987.654.321-00");

    Imovel casa = new Casa("Rua Oliveira Dois", "123", 2000, felipe);
    Imovel apartamento = new Apartamento("Avenida Paulista", "456", 3000, lauri);

    casa.setAlugado(false);
    apartamento.setAlugado(true);

    imoveis.add(casa);
    imoveis.add(apartamento);
  }

  public void adicionar(Imovel imovel) {
    imoveis.add(imovel);
  }

  public void remover(int index) {
    imoveis.remove(index);
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

