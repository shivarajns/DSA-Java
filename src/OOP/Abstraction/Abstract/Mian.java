package OOP.Abstraction.Abstract;

public class Mian {
    public static void main(String[] args) {

        Circle circle = new Circle("Blue", 2);
        System.out.println(circle.Area());
        String color = circle.color;
        System.out.println(color);

        Square square = new Square("red", 6);
        System.out.println(square.Area());
        square.flip();

    }
}
