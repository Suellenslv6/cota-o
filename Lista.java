import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = s.nextInt();
        System.out.println("Digite um número: ");
        int num2 = s.nextInt();
        System.out.println("Digite um número: ");
        int num3 = s.nextInt();

        OrdemDesc(num1, num2, num3);

        s.close();
    }

    public static void OrdemDesc(int num1, int num2, int num3) {
        int maior, meio, menor;

        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
            if (num2 >= num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
            if (num1 >= num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 >= num2) {
                meio = num1;
                menor = num2;
            } else {
                meio = num2;
                menor = num1;
            }
        }

        System.out.println(maior + " >= " + meio + " >= " + menor);
    }

}
