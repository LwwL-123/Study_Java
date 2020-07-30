public class Demo_chuandi {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.age = 18;
        stu.name = "zzw";
        chuandi(stu);
    }

    public static void chuandi(Student stu1) {
        System.out.println(stu1.age);
        System.out.println(stu1.name);
        stu1.sleep();
    }
}