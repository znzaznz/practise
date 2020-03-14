import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
//        第二题：键盘输入一个字符串，并且统计出其中各种字符的出现的次数，种类有：大写字母，小写字母，数字，其他
        System.out.println("please input:");
        String str = new Scanner(System.in).next();
        int largeLetter = 0;
        int smallLetter = 0;
        int number = 0;
        int others = 0;

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] && chars[i] <= 'z'){
                smallLetter++;
            }else if ('A' <= chars[i] && chars[i] <= 'Z'){
                largeLetter++;
            }else if('0' <= chars[i] && chars[i] <= '9'){
                number++;
            }else{
                others++;
            }
        }

        System.out.println(chars);
        System.out.println("your input largeletter's number is: "+largeLetter);
        System.out.println("your input smallletter's number is: "+smallLetter);
        System.out.println("your input number is:"+number);
        System.out.println("your input others number is: "+others);
    }
}
