package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Biblioteca.fatorial;

public class Demonstracao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numeroUser;

        System.out.print("Insira um número: ");
        numeroUser= input.nextInt();

        int fatorialCalculado = fatorial(numeroUser);

        System.out.println(fatorialCalculado);

        System.out.println(fatorial(10));

    }
}
