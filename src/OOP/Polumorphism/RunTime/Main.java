package OOP.Polumorphism.RunTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------Run Time Polymorphism--------");

        Person p;

        p =new Father();
        p.role();

        p=new Mother();
        p.role();

        p=new Person();
        p.role();
    }
}
