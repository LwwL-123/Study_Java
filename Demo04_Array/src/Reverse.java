
public class Reverse {
    public static void main(String[] args) {
        int[] arry = new int[]{
                10, 20, 30, 40, 50, 60, 70
        };

        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
        System.out.println("============");
        int t;

        for (int i = 0; i < arry.length / 2; i++) {
            t = arry[i];
            arry[i] = arry[arry.length - 1 - i];
            arry[arry.length - 1 - i] = t;
        }

        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
    }
}