public class demo8 {
    public static void main(String[] args) {
        Student stu1 = new Student("郭靖",11);
        System.out.println("我叫："+stu1.getName()+",我今年："+stu1.getAge()+"我的ID是："+stu1.getIdcounter());
        Student stu2 = new Student("黄蓉",22);
        System.out.println("我叫："+stu2.getName()+"我今年："+stu2.getAge()+"我的ID是："+ stu2.getIdcounter());
    }
}
