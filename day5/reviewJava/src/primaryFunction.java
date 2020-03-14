import java.util.Scanner;

public class primaryFunction {
    public static void main(String[] args) {
//        基础语法练习之根据月份输出对应季节
        while (true){
            System.out.println("please console your month:");
            Scanner sc = new Scanner(System.in);
            int mon = sc.nextInt();
            System.out.println("your ask month is "+returnMonth(mon));
            System.out.println("do you want again?");
            int str = sc.nextInt();
            if (str == 0){
                System.out.println("ok");
                break;
            }
        }
    }
    public static String returnMonth(int mon){
        if(mon < 0){
            return "your month is impossible";
        }else if(mon > 2 && mon < 6){
            return "your month is Spring";
        }else if(mon > 5 && mon < 9){
            return "your month is Summer";
        }else if (mon > 8 && mon < 11){
            return "your month is Autumn";
        }else if ((mon > 10 && mon < 13) || (mon > 0 && mon < 3)){
            return "your month is winter";
        }else{
            return "your month is impossible";
        }
    }
}
