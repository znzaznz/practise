import java.util.Scanner;

public class primaryFunction2 {
    public static void main(String[] args) {
        System.out.println("please input your number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        panduan(num);
    }
    public  static  void panduan(int num){
        switch (num){
            case 3:
            case 4:
            case 5:
                System.out.println("this is Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("this is Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("this is Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("this is winter");
                break;
            default:
                System.out.println("It's impossible");
        }
    }
}
