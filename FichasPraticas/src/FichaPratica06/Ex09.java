package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex08.*;

public class Ex09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] lista = lerLista();

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\nMENU");
            System.out.println("1. Maior Elemento");
            System.out.println("2. Menor Elemento");
            System.out.println("3. Crescente ou Não Crescente");
            System.out.println("4. Trocar a Lista");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("Maior: " + maior(lista));
            } else if (opcao == 2) {
                System.out.println("Menor: " + menor(lista));
            } else if (opcao == 3) {
                System.out.println(crescente(lista) ? "Crescente" : "Não Crescente");
            } else if (opcao == 4) {
                lista = lerLista();
            } else if (opcao == 5) {
                System.out.println("A sair...");
            } else {
                System.out.println("Opção inválida.");
            }
        }

    }
}