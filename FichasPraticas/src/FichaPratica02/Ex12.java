package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        // Apresentar opções
        System.out.println("_____ MENU _____");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        // Ler opção
        System.out.print("\nOpção: ");
        opcao= input.nextInt();

        switch (opcao){

            case 1:
                System.out.println("\n__ CRIAR __");
                break;

            case 2:
                System.out.println("\n__ ATUALIZAR __");
                break;

            case 3:
                System.out.println("\n__ ELIMINAR __");
                break;

            case 4: // Sair
                break;

            default:
                System.out.println("\n__ OPÇÃO INVÁLIDA __");
                break;

        }
    }
}
