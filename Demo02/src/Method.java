
public class Method {

    public static void main(String[] args) {

        //单独调用
        sum(10,20);
        System.out.println("=========");
        //打印调用
        System.out.println(sum(10,20));
        System.out.println("=========");
        //赋值调用
        int number = sum(10,20);
        System.out.println("变量的值："+number);
        System.out.println("=========");
    }

    public static int sum(int a,int b){
        System.out.println("success");
        int result = a+b;
        return result;
    }
}