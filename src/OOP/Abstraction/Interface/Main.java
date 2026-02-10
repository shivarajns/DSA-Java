package OOP.Abstraction.Interface;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Interface Abstraction--------");

        Circle c = new Circle(2);
        System.out.println(c.Area());
    }
}
