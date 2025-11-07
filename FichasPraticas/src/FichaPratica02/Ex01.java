package FichaPratica02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2;

        // Ler números
        System.out.print("Insira o 1º número: ");
        num1 = input.nextInt();

        System.out.print("Insira o 2º número: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("Maior: " + num1);
        } else {
            System.out.println("Maior: " + num2);
        }

    }
}
