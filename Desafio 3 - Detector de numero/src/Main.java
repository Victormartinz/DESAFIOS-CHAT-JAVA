import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero: ");
        int numero = scanner.nextInt();

        String resultadoSinal = "";
        String resultadoParidade = "";

        if (numero % 2 == 0 ){
            resultadoParidade = "Par";
        }else {
            resultadoParidade = "Impar";
        }

        if (numero > 0){
            resultadoSinal = "Positivo";
        } else if (numero < 0) {
            resultadoSinal = "Negativo";
        } else {
            resultadoSinal = "Neutro";
        }

        System.out.println("O número é " + resultadoParidade + " e " + resultadoSinal);

    }
}
