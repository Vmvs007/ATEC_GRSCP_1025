package FichaPratica06;

import java.util.Random;

public class ExemploRandom {
    public static void main(String[] args) {

        Random rd = new Random();

        int aleatorio01 = rd.nextInt();
        System.out.println("Random completo: " + aleatorio01);


        int aleatorio02 = rd.nextInt(5);
        System.out.println("Random c/ bound: " + aleatorio02);


        int aleatorio03 = rd.nextInt(50, 90);

        System.out.println("Random c/ origem e bound: " + aleatorio03);


    }
}
