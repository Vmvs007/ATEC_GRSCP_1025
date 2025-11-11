package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double nota1, nota2, nota3, mediaPonderada;

        // Ler notas
        System.out.print("Insira a 1º nota ( 0 - 20 ): ");
        nota1 = input.nextDouble();

        System.out.print("Insira a 2º nota ( 0 - 20 ): ");
        nota2 = input.nextDouble();

        System.out.print("Insira a 3º nota ( 0 - 20 ): ");
        nota3 = input.nextDouble();

        // Calcular a média ponderada
        mediaPonderada = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.4);

        // Aprovado ou não
        if (mediaPonderada >= 9.5) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

    }
}
