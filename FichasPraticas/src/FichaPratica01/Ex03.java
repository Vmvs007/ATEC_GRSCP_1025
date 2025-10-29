package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int ladoA, ladoB, perimetro, area;

        // Ler dimensões
        System.out.print("Introduza o comprimento: ");
        ladoA = input.nextInt();

        System.out.print("Introduza a largura: ");
        ladoB = input.nextInt();

        // Calcular e apresentar o perímetro
        perimetro = ladoA + ladoA + ladoB + ladoB;
        System.out.println("Perímetro: " + perimetro);

        // Calcular e apresentar a área
        area = ladoA * ladoB;
        System.out.println("Área: " + area);

    }
}
