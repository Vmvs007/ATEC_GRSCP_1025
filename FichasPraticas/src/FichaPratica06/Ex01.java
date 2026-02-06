package FichaPratica06;

import java.util.Scanner;

public class Ex01 {

    public static int lerInteiroPositivo() {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduza um número: ");
            n = input.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void imprimirAsteriscos(int n) {
        for (int i = 0; i < n; i++) System.out.print("*");
        System.out.println();
    }

    public static void main(String[] args) {

        imprimirAsteriscos(lerInteiroPositivo());
    }
}
