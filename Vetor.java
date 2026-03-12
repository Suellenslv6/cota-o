import java.util.Scanner;

public class Vetor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            boolean repetido;

            do {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                int numero = scanner.nextInt();
                repetido = false;

                for (int j = 0; j < i; j++) {
                    if (vetor[j] == numero) {
                        repetido = true;
                        break;
                    }
                }

                if (repetido) {
                    System.out.println("Valor já digitado! Digite um número diferente.");
                } else {
                    vetor[i] = numero;
                }

            } while (repetido);
        }

        System.out.print("Números digitados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) System.out.print(" ");
        }
        System.out.println();

        scanner.close();
    }
}
