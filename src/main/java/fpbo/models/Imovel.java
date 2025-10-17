package fpbo.models;

public abstract class Imovel {
  protected String endereco;
  protected String numero;
  protected boolean alugado;
  private Proprietario proprietario;

  public abstract boolean estaAlugado();

  public String contatoProprietario() {
    return proprietario.getTelefone();
  }

  public Integer calcularAluguel(int valorBase, int mesesContrato) {
    double desconto = calcularDesconto(mesesContrato);
    double valorFinal = valorBase * (1 - desconto);

    return (int) Math.round(valorFinal);
  }

  protected double calcularDesconto(int mesesDeContrato) {
    if (mesesDeContrato < 12) return 0.0;

    int anosDeContrato = mesesDeContrato / 12;
    return Math.min(anosDeContrato * 0.01, 0.15);
  }
}
