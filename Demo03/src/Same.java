public class Same {
    public static void main(String[] args) {
        System.out.println(ifSame(10, 20));
        System.out.println("======");

        System.out.println(ifSame(10, 10));
        System.out.println("======");
    }

    public static boolean ifSame(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}