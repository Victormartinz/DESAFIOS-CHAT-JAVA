import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Escolha uma opcão: \n" +
                "1 - Soma \n" +
                "2 - Subtração \n" +
                "3 - multiplicação \n" +
                "4 - divisão");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado: " + (numero1-numero2));
                break;
            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case 4:
                if ( numero2 == 0){
                    System.out.println("Erro: Divisão não existe");
                } else {
                    System.out.println("Resultado: " + (numero1 / numero2));
                }

                break;
            default:
                System.out.println("Opção invalida, escolha de 1 a 4");

        }
    }
}
