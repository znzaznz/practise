public class demo2 {
    public static void main(String[] args) {
//        compare with each String ---- equals
        String str1 = "xiaoxiao";
        String str2 = "xiaoxiao";
        String str3 = new String("xiaoxiao");

        System.out.println(str1 == str2);
        System.out.println(str3 == str1);
        System.out.println(str2 == str3);

//        这是地址值的比较，很容易看出来，此时是true，false，false

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str1));

//        此时是单纯的值比较，不难看出，全是true
    }
}
