package demo7;

import org.w3c.dom.ls.LSOutput;

public class Stringdemo {
//    there are four ways to achieve String

    public static void main(String[] args) {

        String s1 = "this is first way";

        String s2 = new String();

        char[] arr1 = {'a', 'b', 'c'};
        String s3 = new String(arr1);

        byte[] arr2 = {92, 93, 94};
        String s4 = new String(arr2);

        System.out.println(s1+" "+s2+" "+s3+" "+s4);
    }

}
