package OOP.Polumorphism.ComileTime;
//Compile time polymorphism
public class Main {
    public static void main(String[] args) {
        System.out.println("--------MULTIPLICATION--------");

        Multiplication multi = new Multiplication();

        int c = multi.Multi(2, 3);
        System.out.println(c);

        double d = multi.Multi(2.2, 3.1);
        System.out.println(d);


        System.out.println(multi.Multi(5.3 , 3));
    }
}
