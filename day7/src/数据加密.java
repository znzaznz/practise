import java.util.Scanner;

public class 数据加密 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your number(four figures):");
        int num = sc.nextInt();
        int[] arr = {num%10 ,num/10%10,num/100%10,num/1000%10};
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
        int temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
        temp = arr[0];
        arr[0] = arr[3];
        arr[3] = temp;
        num = 0;
        for (int i = 0; i < arr.length; i++) {
//            num += arr[i] + Math.pow(10,i);
            System.out.println(arr[i]);
        }

        System.out.println(num);
    }
}
