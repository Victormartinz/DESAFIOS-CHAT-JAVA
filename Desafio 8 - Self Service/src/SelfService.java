import java.util.Scanner;

public class SelfService {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double divisao = 1000.0;
        int opcao  = 0;

        while (opcao != 4){
            System.out.println("=========MENU=========");
            System.out.println("1 - Prato Feito (PF): R$ 20,00 ");
            System.out.println("2 - Self-Service (Quilo): R$ 45,00 por KG");
            System.out.println("3 - Bebida: R$ 5,00");
            System.out.println("4 - Encerrar o Pedido");
            System.out.println("=====================");
            System.out.println("Escolha uma das Opções: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você escolheu o Prato feito, no valor de R$ 20,00");
                    total += 20.0;
                    break;

                case 2:
                    System.out.println("Você escolheu Sel-Service de R$ 45,00 KG. Quantas Gramas deu o prato? ");
                    double gramasPrato = scanner.nextDouble();
                    total += (gramasPrato / 1000.0) * 45.00;
                    break;

                case 3:
                    System.out.println("Você escolheu uma bebida no valor de R$ de 5,00");
                    total += 5.0;
                    break;

                case 4:
                    System.out.printf("Valor total do pedido: R$ %.2f%n", total);
                    break;

                default:
                    System.out.println("Opção Inválida, tente novamente");
                    break;
            }
        }
        scanner.close();
    }
}
