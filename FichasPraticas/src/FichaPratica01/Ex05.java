package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double nota1, nota2, nota3, mediaAritmetica, mediaPonderada;

        // Ler notas
        System.out.print("Insira a 1º nota: ");
        nota1 = input.nextInt();

        System.out.print("Insira a 2º nota: ");
        nota2 = input.nextInt();

        System.out.print("Insira a 3º nota: ");
        nota3 = input.nextInt();

        // Calcular e apresentar a média aritmética
        mediaAritmetica = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média Aritmética: " + mediaAritmetica);

        // Calcular e apresentar a média ponderada
        mediaPonderada = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);
        System.out.println("Média Ponderada: " + mediaPonderada);


    }
}
