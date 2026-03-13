import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, sou o porteiro!");
        System.out.println("Digite sua idade para entrar: ");
        int idade = scanner.nextInt();

        if (idade < 18){
            System.out.println("Entrada proibida!");
        } else if (idade <= 59){
            System.out.println("Entrada liberada");
            System.out.println("Aproveite a festa");
        } else {
            System.out.println("Entrada Especial");
            System.out.println("Aproveite a festa");
        }



    }
}
