import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
 
        int numero;
        String agencia,nomeCliente;
        double saldo = 12000;

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o número (ENTER): ");
        numero = ler.nextInt();
        System.out.println("Informe a Agencia (ENTER): ");
        agencia = ler.nextLine();
        ler.nextLine();
        System.out.println("informe o seu nome (ENTER): ");
        nomeCliente = ler.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,"+
         "sua agência é %s, conta %d e seu"+
         " saldo %.2f já está disponível para saque",nomeCliente,agencia,numero,saldo);





}
}