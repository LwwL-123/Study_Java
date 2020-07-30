
//间接访问成员变量，就是设置成员方法
public class Person {
    private int age;
    String name;

    public void show() {
        System.out.println("我叫" + name);
        System.out.println("今年" + age);
    }

    public void setAge(int num) {
        if (num > 0) {
            age = num;
        }
        else {
            System.out.println("年龄输入错误额");
        }
    }
    public int getAge() {
        return age;
    }
}