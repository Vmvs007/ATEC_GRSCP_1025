package FichaPratica06;

public class Ex02 {

    public static int numeroMaisPequeno(int a, int b, int c) {
        int m = a;

        if (b < m){
            m = b;
        }

        if (c < m){
            m = c;
        }

        return m;
    }

}
