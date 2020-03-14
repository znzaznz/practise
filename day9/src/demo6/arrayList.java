package demo6;

import java.util.ArrayList;
import java.util.Random;

public class arrayList {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt(100)+1;
        }

        ArrayList<Integer> simeArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                simeArr.add(arr[i]);
            }
        }

        System.out.println(simeArr);
    }
}
