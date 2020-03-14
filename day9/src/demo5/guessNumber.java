package demo5;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        int num = new Random().nextInt(100);
        while (true){
        System.out.println("please input your number(1-100):");
        int guessNum = new Scanner(System.in).nextInt();
            if(guessNum > num ){
                System.out.println("too large!");
            }else if (guessNum < num){
                System.out.println("too small!");
            }else {
                System.out.println("gongratulate!");
                break;
            }
        }
    }
}
