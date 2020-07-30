
import java.util.Arrays;
import java.util.Random;

public class Random_test {
    public static void main(String[] args) {
        int caipiao[] = new int[6];
        int red = 33;
        int blue = 16;
        //红球
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int result = r.nextInt(red) + 1;
            caipiao[i] = result;
        }
        System.out.println("下一期的开奖号码为：");
        Arrays.sort(caipiao);
        System.out.print("红球：");
        for (int i = 0; i < caipiao.length; i++) {
            if (i == 0)
                System.out.print(caipiao[i]);
            else
                System.out.print(" " + caipiao[i]);
        }
//篮球
        int result2 = r.nextInt(blue) + 1;

        System.out.println("\n"+"蓝球：" + result2);


    }

}