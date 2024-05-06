import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String agencia = "067-8";

        String menu = """
                ******************************
                
                SEJA BEM VINDO AO NOSSO BANCO!
                  PARA ABRIR UMA CONTA É SÓ
                  SEGUIR OS PROXIMOS PASSOS.
                     
                ******************************""";

        System.out.println(menu);

        System.out.println("Por favor digite o numero da conta:  ");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("informe o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo R$" + saldo +  " já está disponível para saque.");

    }
}
