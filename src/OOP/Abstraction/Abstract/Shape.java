package OOP.Abstraction.Abstract;

abstract class Shape {

    String color;
    double size;

    public Shape(String color, double size){
        this.color = color;
        this.size = size;
    }

    abstract double Area();

    public void color( String color){
        System.out.println("Color: "+color);
    }

    //optional
    public void flip(){
        System.out.println("This shape can be flipped.");
    }

}
