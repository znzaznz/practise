package demo4;

import java.util.Random;

public class JavaRandom {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt();
            System.out.println("num is " + num);
        }
    }
}
