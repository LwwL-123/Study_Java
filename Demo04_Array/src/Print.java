public class Print {
    public static void main(String[] args) {
        int[] arryA = new int[]{10, 20, 30, 40, 50, 60};
        printarray(arryA);
        printarray(arryA);
    }

    public static void printarray(int arry[]) {//传递地址值
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
    }
}