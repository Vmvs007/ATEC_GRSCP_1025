package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int quantidadeNumeros, contador = 1, numeroAnterior, numeroAtual;
        boolean crescente = true;

        // Perguntar a quantidade de numeros
        System.out.print("Quantos números queres introduzir: ");
        quantidadeNumeros = input.nextInt();

        System.out.print("Insira um número: ");
        numeroAnterior = input.nextInt();

        while (contador < quantidadeNumeros) {
            System.out.print("Insira um número: ");
            numeroAtual = input.nextInt();

            if (numeroAtual <= numeroAnterior) {
                // Se isto acontecer, a sequencia deixa de ser crescente
                crescente = false;
            }

            numeroAnterior = numeroAtual;
            contador++;
        }


        if (crescente==true){
            System.out.println("Crescente");
        }else{
            System.out.println("Não crescente");
        }

    }
}
