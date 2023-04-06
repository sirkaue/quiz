import java.util.Scanner;
/* Criando um quiz */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Quiz de geografia\n\n1. Qual a capital do estado de São Paulo?");
    System.out.println("Escolha uma opção:\n\na) Brangança Paulista\nb) São Paulo\nc) Cruzeiro\n");
    String resposta = input.next();
    int acerto = 0;
    if ("b".equals(resposta)) {
      acerto = acerto + 1;
    }
    System.out.println("2. Qual a capital do estado do Rio de Janeiro?");
    System.out.println("Escolha uma opção:\n\na) Rio de Janeiro\nb) Paraty\nc) Natal\n");
    resposta = input.next();
    if ("a".equals(resposta)) {
      acerto = acerto + 1;
    }
    System.out.println("3. Qual a capital do estado do Rio Grande do Sul?");
    System.out.println("Escolha uma opção:\n\na) Porto Alegre\nb) Rolândia\nc) Porto Seguro\n");
    resposta = input.next();
    if ("a".equals(resposta)) {
      acerto = acerto + 1;
    }
    System.out.println("4. Qual a capital do estado do Sergipe?");
    System.out.println("Escolha uma opção:\n\na) Palmas\nb) Aracaju\nc) Belém\n");
    resposta = input.next();
    if ("b".equals(resposta)) {
      acerto = acerto + 1;
    }
    System.out.println("5. Qual a capital do estado do Rondônia?");
    System.out.println("Escolha uma opção:\n\na) Natal\nb) Porto Velho \nc) Palmas\n");
    resposta = input.next();
    if ("b".equals(resposta)) {
      acerto = acerto + 1;
    }
    System.out.println("6. Qual a capital do estado do Santa Catarina?");
    System.out.println("Escolha uma opção:\n\na) Joinville\nb) Florianópolis\nc) Brasília\n");
    resposta = input.next();
    if ("b".equals(resposta)) {
      acerto = acerto + 1;
    }
    System.out.println("7. Qual a capital do estado do Roraima?");
    System.out.println("Escolha uma opção:\n\na) Boa Vista\nb) João Pessoa\nc) Cuiabá\n");
    resposta = input.next();
    if ("a".equals(resposta)) {
      acerto = acerto + 1;
    }
    System.out.println("8. Qual a capital do estado do Paraná?");
    System.out.println("Escolha uma opção:\n\na) Águas Claras\nb) Curitiba\nc) Vitória\n");
    resposta = input.next();
    if ("b".equals(resposta)) {
      acerto = acerto + 1;
    }
    System.out.println("9. Qual a capital do estado do Pará?");
    System.out.println("Escolha uma opção:\n\na) Belém\nb) Belo Horizonte\nc) Teresina\n");
    resposta = input.next();
    if ("a".equals(resposta)) {
      acerto = acerto + 1;
    }
    System.out.println("10. Qual a capital do estado do Amapá?");
    System.out.println("Escolha uma opção:\n\na) Maceió\nb) Macapá\nc) Rio Branco\n");
    resposta = input.next();
    if ("b".equals(resposta)) {
      acerto = acerto + 1;
    }
    if (acerto <= 4) {
      System.out.println("Manja nada!\nAcertos: " + acerto);
    } else if (acerto <= 8) {
      System.out.print("Bom, mas pode melhorar!\nAcertos: " + acerto);
    } else if (acerto <= 9) {
      System.out.println("Foi quase!\nAcertos: " + acerto);
    } else {
      System.out.println("Você é o cara!\nAcertos: " + acerto);
    }
  }
}