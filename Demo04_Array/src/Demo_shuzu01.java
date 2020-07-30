//arrayA.fori 遍历数组

public class Demo_shuzu01 {
    public static void main(String[] args) {
        int i = 0;
        int[] shuZu = new int[10];
        for (i = 0; i < 10; i++) {
            shuZu[i] = i;
        }
        for (i = 0; i < 10; i++) {
            System.out.println(shuZu[i]);
        }

    }
}