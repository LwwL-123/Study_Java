
/*
一个标准的类通常有一下几个部分构成：
1.所有成员变量都要使用private关键字修饰;
2.为所有成员的编写一对Getter/Setter方法
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}