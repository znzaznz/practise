import java.util.Random;

public class reviewRandomAndArray {
    public static void main(String[] args) {
//        综合前面所学的，做一个随机的数组，数字全部随机定
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(10);
            arr[i] = num;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
