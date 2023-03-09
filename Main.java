import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User userA = new User();
        userA.firstName = "Joao Victor";
        userA.lastName = "da Silva";
        userA.password = "02390239";

        User userB = new User();
        userB.firstName = "Tatiane";
        userB.lastName = "Feuser";
        userB.password = "12345678";

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite seu nome de usuario: ");
            String userName = sc.nextLine();
            if (userName.equals(userA.firstName)) {
                System.out.print("Por favor, Digite sua senha: ");
                String pass = sc.nextLine();
                System.out.println(userA.password.equals(pass));
                System.out.println("Bem vindo: "+ userA.firstName);}
            else if (userName.equals(userB.firstName)) {
                System.out.print("Por favor, Digite sua senha: ");
                String pass = sc.nextLine();
                System.out.println(userB.password.equals(pass));
                System.out.println("Bem-vinda " + userB.firstName);}
            else System.out.println("usuario não encontrado");
        }
    }
}
