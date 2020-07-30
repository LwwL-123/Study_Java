public class Annoymous {
    public static void main(String[] args) {

        Person one = new Person();
        //one就是对象的名字
        one.name = "lzw";
        one.showname();

        //匿名对象
        new Person().name="ZZW";
        new Person().showname();


    }


}