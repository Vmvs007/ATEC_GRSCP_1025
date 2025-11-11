package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int horas, minutos;

        // Ler horas e minutos
        System.out.print("Horas: ");
        horas = input.nextInt();

        System.out.print("Minutos: ");
        minutos = input.nextInt();

        // Apresentar em formato 12h
        if (horas <= 12) {
            // Manhã - AM
            System.out.println(horas + ":" + minutos + " AM");
        } else {
            // Tarde - PM
            horas = horas - 12;
            System.out.println(horas + ":" + minutos + " PM");
        }


    }
}
