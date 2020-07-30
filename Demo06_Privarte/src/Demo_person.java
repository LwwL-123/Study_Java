public class Demo_person {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "lzw";

        person.setAge(0);
        System.out.println(person.getAge());
        System.out.println("=============");
        person.setAge(18);
        System.out.println(person.getAge());
        System.out.println("=============");
        person.show();
    }
}