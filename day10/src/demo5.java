public class demo5 {
    public static void main(String[] args) {
        String str = "xiaoxiaoILoveYou";

//        接下来又是几个新的方法，我这边再次介绍：toCharArray,getBytes,replace

//        System.out.println(str);
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str1 = str.replace("xiao","nan");
        System.out.println(str1);
    }
}
