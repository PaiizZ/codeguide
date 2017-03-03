package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Triangle(4, 3));

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }

    }
}
