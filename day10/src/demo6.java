public class demo6 {
    public static void main(String[] args) {
//        接下来是Java String的知识点总结：
//        1.四种方法申明String
//        2.各种方法，concat,substring,length,charAt,indexof,toCharArray,getBytes,replace,equals
//        那么接下来是题目：这是一道综合题，定义一个方法，把数组的{1,2,3}按照指定的格式拼接成一个字符串，格式参考如下{word1#word2#word3}

//        分析，此时不难看出，不过就是“{}”加上一堆定义的字符罢了
        int[] ints = {1,2,3};
        String str = "{";
        for (int i = 0; i < ints.length; i++) {
            if (i == ints.length-1) {str += ints[i] + "}"; break;}
            str += "word" + ints[i] + "#";
        }

        System.out.println(str);
    }
}
