/*
1.导包：指出所用的类在什么位置（对于和当前类属于同一个包的可以不写）
import 包名称.类名称
2.创建：类名称 对象名 = new 类名称（）
Student stu1 = new Stuedent（）
3.使用：对象名.成员变量名
       对象名.成员方法名（参数）
*/
public class Demo_Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.eat();
        stu1.sleep();
        stu1.study();
    }
}