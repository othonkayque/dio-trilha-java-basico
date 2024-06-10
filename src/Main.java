import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws Exception{
        Scanner scanner = new Scanner(System.in);

        ContaTerminal usuario = new ContaTerminal();




        System.out.print("Digite o nome da agencia: ");
        usuario.NomeAgencia = scanner.next();

        System.out.print("Digite o seu nome: ");
        usuario.Nome = scanner.next();

        System.out.print("Digite o seu saldo: ");
        usuario.Saldo = scanner.nextInt();

        System.out.print("Digite o numero: ");
        usuario.Numero = scanner.nextInt();

        usuario.pagamento(20);
        System.out.print(usuario.Saldo);


    }
}