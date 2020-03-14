package demo6;

import java.util.ArrayList;

public class NameArr {
    public static void main(String[] args) {
        Student ruby = new Student("Ruby",20);
        Student beryl = new Student("beryl",20);
        Student sapphire = new Student("sapphire",20);
        Student diamond = new Student("diamond",20);

        ArrayList<Student> student = new ArrayList<>();
        student.add(ruby);
        student.add(beryl);
        student.add(sapphire);
        student.add(diamond);

        String sou = "{";
        for (int i = 0; i < student.size(); i++) {
            sou += student.get(i).getName()+"@";
        }
        sou += "}";
        System.out.println(sou);
    }
}
