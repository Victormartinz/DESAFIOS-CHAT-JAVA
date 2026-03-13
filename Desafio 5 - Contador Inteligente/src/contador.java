import java.util.Scanner;

public class contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro número: ");
        int inicio = scanner.nextInt();
        System.out.println("Digite o Segundo número: ");
        int fim  = scanner.nextInt();



       while(inicio <= fim){
           System.out.println(inicio);
           inicio++;
       }

    }
}
