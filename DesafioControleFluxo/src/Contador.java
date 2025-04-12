
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws ParametrosInvalidosException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num1 = scan.nextInt();

        System.out.println("Digite um número inteiro menor que o anterior:");
        int num2 = scan.nextInt();
        scan.close();
        try {
            // chamando o método contendo a lógica de contagem
            contar(num1, num2);
        } catch (ParametrosInvalidosException pie) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            throw new ParametrosInvalidosException();
        }

    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (num1 < num2) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        else {
            int count = num1 - num2;
            for (int i = 1; i <= count; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }

    }
}