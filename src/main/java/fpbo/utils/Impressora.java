package fpbo.utils;

import java.util.Scanner;

public class Impressora {
  private static final Scanner scanner = new Scanner(System.in);

  public static String lerEntradaString(String mensagem) {
    System.out.print(mensagem + ": ");
    return scanner.nextLine();
  }

  public static int lerEntradaInt(String mensagem) {
    System.out.print(mensagem + ": ");
    return Integer.parseInt(scanner.nextLine());
  }

  public static void pausar() {
    System.out.println("Pressione Enter para continuar...");
    scanner.nextLine();
  }
}
