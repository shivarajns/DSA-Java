package OOP.Polumorphism.ComileTime;

public class Multiplication {

    public int Multi(int a, int b){
        return a*b;
    }

    public double Multi(double a, double b){
        return a*b;
    }

    public double Muti(int a, double b){
        return a*b;
    }public double Muti(double a, int b){
        return a*b;
    }
}
