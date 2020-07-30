public class Use_student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("lzw");
        stu1.setAge(22);

        System.out.println("姓名：" + stu1.getName() + "年龄：" + stu1.getAge());
        System.out.println("===========");

        Student stu2 = new Student("zzw", 18);
        System.out.println("姓名：" + stu2.getName() + "年龄：" + stu2.getAge());
        stu2.setAge(19);
        System.out.println("姓名：" + stu2.getName() + "年龄：" + stu2.getAge());
    }
}
