import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

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
                divisor = divisor + 1;
            }
        }

        if (ehPrimo == true) {
            System.out.println("É Primo");
        } else {
            System.out.println("Não é primo");
        }



    }
}

