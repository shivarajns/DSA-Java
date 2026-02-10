package OOP.Abstraction.Abstract;

import java.awt.geom.Area;

public class Circle extends Shape{

    public Circle (String color, double radius){
        super(color, radius);
    }

    @Override
    double Area() {
        return Math.PI * size * size;
    }

}
