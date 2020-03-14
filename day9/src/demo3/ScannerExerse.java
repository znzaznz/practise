package demo3;

import java.util.Scanner;

public class ScannerExerse {
    public static void main(String[] args) {
        //键盘输入两个int,并且求和
        System.out.println("请输入你的第一个数字：");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("请输入你的第二个数字：");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("这两个数字的和是"+(num1 + num2));
    }
}
