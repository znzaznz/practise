package demo6;

import java.util.ArrayList;

public class arrayListAPI {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

//        this is the way to add number to arraylist
        arr.add(10);
        System.out.println(arr);

//        this is the way to set point index number
        arr.set(0,10);

//        this is the way to show arraylist
        arr.contains(10);
        System.out.println(arr.contains(20));

//        this is the way to show the size of arraylist
        System.out.println(arr.size());
    }
}
