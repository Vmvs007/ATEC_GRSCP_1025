package FichaPratica06;

public class Biblioteca {

    public static int fatorial(int num) {

        int resultado = num;
        int decremento = num - 1;

        while (decremento > 0) {
            resultado *= decremento--;
        }
        return resultado;

    }

}
