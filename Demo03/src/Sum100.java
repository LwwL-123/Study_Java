public class Sum100 {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static int sum(){
        int a = 0;
        for(int i = 1;i <= 100;i++)
        {
            a+=i;
        }
        return a;
    }
}
