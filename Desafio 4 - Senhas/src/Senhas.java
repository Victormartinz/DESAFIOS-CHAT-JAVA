import java.util.Scanner;

public class Senhas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String SenhaFixa = "Java123";
        System.out.println("Digite a senha: ");
        String SenhaUsuario = scanner.nextLine();

        while (!SenhaUsuario.equals(SenhaFixa)){
            System.out.println("Senha Incorreta tente novamente!");

            SenhaUsuario = scanner.nextLine();
        }
        System.out.println("Acesso Liberado");
    }
}
