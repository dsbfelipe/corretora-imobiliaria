package fpbo.models;

public class Casa extends Imovel {
  public Casa(String endereco, String numero, int valorBase, Proprietario proprietario) {
    super(endereco, numero, valorBase, proprietario);
  }

  @Override
  public String estaAlugado() {
    return this.alugado ? "A casa está alugada" : "A casa está disponível";
  }
}

