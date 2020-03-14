public class demo1 {
    public static void main(String[] args) {
//        four ways to achieve String
        String str1 = "this is first way";
        String str2 = new String("this is second way");
        char[] chr = {'t','h','i','r','d'};
        String str3 = new String(chr);
        byte[] byt = {103, 102, 100};
        String str4 = new String(byt);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
