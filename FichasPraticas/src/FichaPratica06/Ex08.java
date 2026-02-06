package FichaPratica06;

import java.util.Scanner;

public class Ex08 {

    public static int maior(int[] v) {
        int m = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > m) m = v[i];
        }
        return m;
    }


    public static int menor(int[] v) {
        int m = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] < m) m = v[i];
        }
        return m;
    }

    public static boolean crescente(int[] v) {
        for (int i = 1; i < v.length; i++) {
            if (v[i] < v[i - 1]) return false;
        }
        return true;
    }

    public static int[] lerLista() {

        Scanner input = new Scanner(System.in);

        System.out.print("Tamanho da lista: ");
        int n = input.nextInt();

        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + i + "]: ");
            v[i] = input.nextInt();
        }
        return v;
    }


}
