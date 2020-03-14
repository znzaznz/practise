package demo1;

import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your name:");
        String name = sc.next();
        System.out.println("your name is "+name);
    }
}
