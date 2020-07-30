

import java.util.Scanner;

public class Annoymous02 {
    public static void main(String[] args) {
        //普通输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int i = sc.nextInt();
        System.out.println("第一个数字为"+i);

        //匿名输入
        System.out.println("请输入第二个数字");
        int j = new Scanner(System.in).nextInt();
        System.out.println("第二个数字为"+j);


    }
}