
import java.util.Scanner;

/*引用类型的基本使用步骤：
1.导包
    import 包路径.类名称;
2.创建
    类名称 对象名 = new 类名称（）;
3.使用
    对象名.成员方法名()；
*/
public class Scanner_test {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int i = sc1.nextInt();
        String str = sc1.next();

        System.out.println(i);
        System.out.println(str);
    }

}