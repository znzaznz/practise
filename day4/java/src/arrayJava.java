import java.util.Random;
import java.util.Scanner;

public class arrayJava {
    public static void main(String[] args) {
//        这段代码是展示random的功能,以及如何使用它

        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println(num);

//        诸君请看，此时我使用random，创建了一个随机数
    }
}
