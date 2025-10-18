package fpbo;

import fpbo.models.*;
import fpbo.utils.Impressora;

public class Main {
  public static void main(String[] args) {
    ListaDeImoveis listaDeImoveis = new ListaDeImoveis();
    boolean continuar = true;

    while (continuar) {
      System.out.println("1. Cadastrar Casa");
      System.out.println("2. Cadastrar Apartamento");
      System.out.println("3. Deletar Imóvel");
      System.out.println("4. Alugar Imóvel");
      System.out.println("5. Liberar Imóvel");
      System.out.println("6. Calcular Aluguel");
      System.out.println("7. Contato do Proprietário");
      System.out.println("8. Listar Disponíveis");
      System.out.println("9. Listar Alugados");
      System.out.println("0. Sair");

      int opcao = Impressora.lerEntradaInt("Escolha uma opção");

      switch (opcao) {
        case 1 -> cadastrarImovel(listaDeImoveis, "Casa");
        case 2 -> cadastrarImovel(listaDeImoveis, "Apartamento");
        case 3 -> deletarImovel(listaDeImoveis);
        case 4 -> alugarImovel(listaDeImoveis);
        case 5 -> liberarImovel(listaDeImoveis);
        case 6 -> calcularAluguel(listaDeImoveis);
        case 7 -> contatarProprietario(listaDeImoveis);
        case 8 -> {
          System.out.println("Imóveis Disponíveis:");
          listaDeImoveis.listarDisponiveis().forEach(imovel -> System.out.println(imovel));
          Impressora.pausar();
        }
        case 9 -> {
          System.out.println("Imóveis Indisponíveis:");
          listaDeImoveis.listarAlugados().forEach(imovel -> System.out.println(imovel));
          Impressora.pausar();
        }
        case 0 -> continuar = false;
        default -> {
          System.out.println("Opção inválida. Tente novamente.");
          Impressora.pausar();
        }
      }
    }
  }

  private static void cadastrarImovel(ListaDeImoveis listaDeImoveis, String tipo) {
    String nome = Impressora.lerEntradaString("Nome do Proprietário");
    String telefone = Impressora.lerEntradaString("Telefone do Proprietário");
    String cpf = Impressora.lerEntradaString("CPF do Proprietário");
    Proprietario proprietario = new Proprietario(nome, telefone, cpf);

    String endereco = Impressora.lerEntradaString("Endereço do Imóvel");
    String numero = Impressora.lerEntradaString("Número do Imóvel");
    int valorBase = Impressora.lerEntradaInt("Valor Base do Aluguel");

    Imovel imovel = tipo.equals("Casa") ?
      new Casa(endereco, numero, valorBase, proprietario) :
      new Apartamento(endereco, numero, valorBase, proprietario);

    listaDeImoveis.adicionar(imovel);
    System.out.println(tipo + " cadastrada com sucesso!");
    Impressora.pausar();
  }

  private static void deletarImovel(ListaDeImoveis listaDeImoveis) {
    System.out.println("Imóveis:");
    listaDeImoveis.listar().forEach(imovel -> System.out.println(listaDeImoveis.listar().indexOf(imovel) + ": " + imovel));
    int index = Impressora.lerEntradaInt("Escolha o imóvel pelo índice");
    listaDeImoveis.remover(index);
    System.out.println("Imóvel removido com sucesso!");
    Impressora.pausar();
  }

  private static void alugarImovel(ListaDeImoveis listaDeImoveis) {
    System.out.println("Imóveis Disponíveis:");
    listaDeImoveis.listarDisponiveis().forEach(imovel -> System.out.println(listaDeImoveis.listar().indexOf(imovel) + ": " + imovel));
    int index = Impressora.lerEntradaInt("Escolha o imóvel pelo índice");
    Imovel imovel = listaDeImoveis.listar().get(index);
    imovel.setAlugado(true);
    System.out.println("Imóvel alugado com sucesso!");
    Impressora.pausar();
  }

  private static void liberarImovel(ListaDeImoveis listaDeImoveis) {
    System.out.println("Imóveis Indisponíveis:");
    listaDeImoveis.listarAlugados().forEach(imovel -> System.out.println(listaDeImoveis.listar().indexOf(imovel) + ": " + imovel));
    int index = Impressora.lerEntradaInt("Escolha o imóvel pelo índice");
    Imovel imovel = listaDeImoveis.listar().get(index);
    imovel.setAlugado(false);
    System.out.println("Imóvel liberado com sucesso!");
    Impressora.pausar();
  }

  private static void calcularAluguel(ListaDeImoveis listaDeImoveis) {
    System.out.println("Imóveis:");
    listaDeImoveis.listar().forEach(imovel -> System.out.println(listaDeImoveis.listar().indexOf(imovel) + ": " + imovel));
    int index = Impressora.lerEntradaInt("Escolha o imóvel pelo índice");
    Imovel imovel = listaDeImoveis.listar().get(index);
    int mesesContrato = Impressora.lerEntradaInt("Número de meses do contrato");
    Integer valorAluguel = imovel.calcularAluguel(mesesContrato);
    System.out.println("O valor do aluguel é: R$ " + valorAluguel);
    Impressora.pausar();
  }

  private static void contatarProprietario(ListaDeImoveis listaDeImoveis) {
    System.out.println("Imóveis:");
    listaDeImoveis.listar().forEach(imovel -> System.out.println(listaDeImoveis.listar().indexOf(imovel) + ": " + imovel));
    int index = Impressora.lerEntradaInt("Escolha o imóvel pelo índice");
    Imovel imovel = listaDeImoveis.listar().get(index);
    String telefone = imovel.contatoProprietario();
    System.out.println("Contato do proprietário: " + telefone);
    Impressora.pausar();
  }
}