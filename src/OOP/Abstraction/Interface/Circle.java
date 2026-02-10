package OOP.Abstraction.Interface;

public class Circle implements Shape {

    private double r;

    public Circle(double r){
        this.r=r;
    }

    public double Area(){
        return Math.PI * r * r;
    }
}
