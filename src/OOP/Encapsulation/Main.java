package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Encapsulation--------");

        Impositor impo = new Impositor();
        System.out.println("The Name is "+impo.getName());

        impo.setName("Person- 2");
        System.out.println("The new Impositor is : "+ impo.getName());


    }
}
