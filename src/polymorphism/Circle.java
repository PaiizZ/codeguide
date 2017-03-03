package polymorphism;

public class Circle implements Shape{
    private double radius;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        //TODO complete this method and javadoc.
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        //TODO complete this method and javadoc.
        return 2*Math.PI*radius ;
    }
}
