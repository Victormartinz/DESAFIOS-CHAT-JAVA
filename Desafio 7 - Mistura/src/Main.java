import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Número: ");
        int numero = scanner.nextInt();

        int opcao = 0;

        while (opcao != 4){
            System.out.println("Escolha uma opção: \n" +
                    "1 - Verificar se é Primo \n" +
                    "2 - Verificar se é Par/Ímpar \n" +
                    "3 - Contagem \n" +
                    "4 - Sair");
             opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    boolean ehPrimo = true;
                    int divisor = 2;
                    if (numero < 2){
                        ehPrimo = false;
                    } else {
                        while (divisor < numero){
                            if (numero % divisor == 0){
                                ehPrimo = false;
                                break;
                            }
                            divisor++;
                     }

                    }
                    if (ehPrimo){
                        System.out.println("Número é Primo");
                        break;
                    } else {
                        System.out.println("Numero não é primo");
                        break;
                    }
                case 2:
                    if (numero % 2 == 0){
                        System.out.println("Número é Par");
                    }else {
                        System.out.println("Número é Ímpar");
                    }
                    break;

                case 3:
                    if (numero > 1){
                        int inicio = 1;
                        while (inicio <= numero){
                            System.out.println(inicio);
                            inicio++;
                        }
                    } else {
                        System.out.println("Número Inválido, digite de 1 a adiante");
                    }
                    break;
                case 4:
                    System.out.println("Estamos saindo do programa....aguarde");
                    break;

                default:
                    System.out.println("Opção Inválida, tente novamente");
                    break;
            }
        }




    }
}
