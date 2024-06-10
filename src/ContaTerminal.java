import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  throws Exception{

        Scanner scanner = new Scanner(System.in);
        InformacoesBanco usuario = new InformacoesBanco();

        System.out.print("Digite o nome da agencia: ");
        usuario.NomeAgencia = scanner.next();

        System.out.print("Digite o seu nome: ");
        usuario.Nome = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Digite o seu saldo: ");
        usuario.Saldo = scanner.nextInt();

        System.out.print("Digite o numero: ");
        usuario.Numero = scanner.nextInt();

        System.out.print("Olá " + usuario.Nome + " sua conta foi criada com sucesso! :)");
    }
}