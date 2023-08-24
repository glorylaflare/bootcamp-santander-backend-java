import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Scanner
        Scanner leitor = new Scanner(System.in);

        //Variáveis
        Integer numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        //Informando dados
        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = leitor.nextLine();
        System.out.println("Por favor, digite o numero da Conta:");
        numero = leitor.nextInt();
        System.out.println("Por favor, digite o numero da Agência:");
        agencia = leitor.next();
        System.out.println("Por favor, digite o seu saldo:");
        saldo = leitor.nextDouble();

        //Mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
