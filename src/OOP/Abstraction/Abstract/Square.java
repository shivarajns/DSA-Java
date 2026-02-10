package OOP.Abstraction.Abstract;

import java.awt.geom.Area;

public class Square extends Shape{

    public Square(String color, double side){
        super(color, side);
    }

    @Override
    double Area(){
        return size * size;
    }

    @Override
    public void flip(){
        System.out.println("This shape can be Flip");
    }
}
