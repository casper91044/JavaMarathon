package day4.material;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.round(Math.random() * 10));
        }
        System.out.println();

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextInt(10) + 1 );
        }
    }
}
