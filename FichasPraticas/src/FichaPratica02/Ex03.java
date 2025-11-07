package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {


        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        double salarioAnual, imposto;

        // Ler salario
        System.out.print("Insira o salário anual: ");
        salarioAnual = input.nextDouble();

        if (salarioAnual <= 15000) {
            imposto = salarioAnual * 0.2;
            System.out.println("Taxa de 20%: " + imposto + " €");
        }

        if (salarioAnual > 15000 && salarioAnual <= 20000) {
            imposto = salarioAnual * 0.3;
            System.out.println("Taxa de 30%: " + imposto + " €");
        }

        if (salarioAnual > 20000 && salarioAnual <= 25000) {
            imposto = salarioAnual * 0.35;
            System.out.println("Taxa de 35%: " + imposto + " €");
        }

        if (salarioAnual > 25000) {
            imposto = salarioAnual * 0.4;
            System.out.println("Taxa de 40%: " + imposto + " €");
        }

    }


}
