package fpbo.models;

public class Apartamento extends Imovel {
  public Apartamento(String endereco, String numero, int valorBase, Proprietario proprietario) {
    super(endereco, numero, valorBase, proprietario);
  }

  @Override
  public String estaAlugado() {
    return this.alugado ? "O apartamento de número " + this.numero + " está alugado" : "O apartamento de número " + this.numero + " está disponível";
  }
}

