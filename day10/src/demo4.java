public class demo4 {
    public static void main(String[] args) {
//        接下去是字符串的截取方法
        String str = "我永远喜欢李睿潇";
        String name = str.substring(5,8);

        System.out.println(name);

//        注意这个方法，他的返回值是[),此时你的左边的取值应该是上一个的结束位置，而右半边则是看要截取的个数，这种做法总是没有错误的
    }
}
