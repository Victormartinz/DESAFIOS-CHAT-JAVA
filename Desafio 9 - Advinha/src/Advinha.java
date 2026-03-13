import java.util.Random;
import java.util.Scanner;

public class Advinha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();

        int acerto = gerador.nextInt(100);
        int palpite = 0;
        int contagem = 0;
        int tentativas = 7;

        while(palpite != acerto && tentativas > 0 ){
            System.out.println("Tente adivinhar o número entre 0 a 100.");
            System.out.println("Você tem " + tentativas + " tentativas");
            System.out.println("Digite o número: ");
            palpite = scanner.nextInt();
            contagem++;
            tentativas--;

            if (palpite > acerto){
                System.out.println("Muito alto!");
            } else if (palpite < acerto) {
                System.out.println("Muito baixo!");
            }else {
                System.out.println("Parabéns, você acertou!, Número Secreto é " + acerto );
                System.out.println("Você tentou " + contagem + " vezes");
                System.out.println("Sobra de tentativas: " + tentativas);
            }
        }
        if (palpite != acerto){
            System.out.println("PERDEU!");
            System.out.println("O número era: " + acerto);
        }
        scanner.close();

    }
}
