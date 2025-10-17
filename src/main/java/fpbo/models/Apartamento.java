package fpbo.models;

public class Apartamento extends Imovel {
  public Apartamento(String endereco, String numero, Proprietario proprietario) {
    super(endereco, numero, proprietario);
  }

  @Override
  public String estaAlugado() {
    return this.alugado ? "O apartamento de número " + this.numero + " está alugado" : "O apartamento de número " + this.numero + " está disponível";
  }
}

