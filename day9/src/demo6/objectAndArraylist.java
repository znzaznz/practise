package demo6;

import java.util.ArrayList;

public class objectAndArraylist {
    public static void main(String[] args) {
        Student s = new Student("xiaoxiao",20);
        Student x = new Student("xiao",22);
        Student z = new Student("zhao",22);

        ArrayList<Student> arrStu = new ArrayList<>();

        arrStu.add(s);
        arrStu.add(x);
        arrStu.add(z);

        System.out.println(arrStu);
    }
}
