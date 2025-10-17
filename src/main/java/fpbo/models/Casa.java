package fpbo.models;

public class Casa extends Imovel {
  public Casa(String endereco, String numero, Proprietario proprietario) {
    super(endereco, numero, proprietario);
  }

  @Override
  public String estaAlugado() {
    return this.alugado ? "A casa está alugada" : "A casa está disponível";
  }
}
