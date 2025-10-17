package fpbo.models;

public class Proprietario {
  private String nome;
  private String telefone;
  private String cpf;

  public Proprietario(String nome, String telefone, String cpf) {
    this.nome = nome;
    this.telefone = telefone;
    this.cpf = cpf;
  }

  public void setNome(String nome) { this.nome = nome; }
  public void setTelefone(String telefone) { this.telefone = telefone; }
  public void setCpf(String cpf) { this.cpf = cpf; }
  public String getNome() { return nome; }
  public String getTelefone() { return telefone; }
  public String getCpf() { return cpf; }
}

