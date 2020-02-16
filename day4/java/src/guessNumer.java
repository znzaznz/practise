import java.util.Random;
import java.util.Scanner;

public class guessNumer {
    public static void main(String[] args) {
//        这段代码是展示一个小游戏———猜数字，请看代码

        Random r = new Random();
        int a = r.nextInt(100);
        while (true){
            System.out.println("please input your guess number:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num > a){
                System.out.println("your number "+num+" is too big for that");
            }else if(num < a){
                System.out.println("your number "+num+" is too small for that");
            }else{
                System.out.println("that is right!");
                break;
            }
        }
    }
}
