import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
    Scanner  scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Olá, qual seu nome, por favor?");
        String nome = scan.next();
    
    System.out.println("Qual o número de sua conta?");
        int conta = scan.nextInt();
    
    System.out.println("Qual o número de sua agência?");
        String agencia = scan.next();
testes
    System.out.println("Qual o seu saldo?");
        float saldo = scan.nextFloat();

    System.out.println("Obrigado por criar uma conta em nosso banco, " + nome + ",sua agência é " + agencia + ", conta número " + conta + ", e seus " + saldo + " já estão disponíveis para saque.");
    scan.close();
    }
}
