package OOP.Inheritance;

public class Main {
    public static void main (String[] args){
        System.out.println("---------------Inheritance---------------");

        Animals animals = new Animals();
        animals.Sound();

        Animals a;


        a = new Cat();
        a.Sound();
        a.Food();

        a = new Dog();
        a.Sound();
        a.Food();


    }
}
