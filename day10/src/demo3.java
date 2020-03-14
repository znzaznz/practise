public class demo3 {
    public static void main(String[] args) {
//        接下来介绍String的四大方法，length concat chatAt indexof
        String str1 = "one";
        String str2 = "two";

        System.out.println(str1.length());
        System.out.println(str1.concat(str2));
        System.out.println(str1.charAt(2));
        System.out.println(str1.indexOf("e"));

//        介绍一下，第一个返回了字符串的长度，第二个拼接了两个字符串，第三个返回你指定位置的值，第四个指出字符串你要查找的值处于的位置
//        此时我的预期是3,onetwo,e,2
    }
}
