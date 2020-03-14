public class 回文数 {
    public static void main(String[] args) {
//        这次我要打印10000内的回文数
        for (int i = 1000; i < 10000; i++) {
        if(yanzheng(i) == true){
            System.out.println("this is a huiwenshu "+i);
        }
        }
    }
    public  static  boolean yanzheng(int num){
        int ge = num % 10;
        int shi = num /10 % 10;
        int bai = num /100 % 10;
        int qian  = num /1000 % 10;
        if (bai==shi && ge == qian){
            return true;
        }else {
            return  false;
        }
    }
}
