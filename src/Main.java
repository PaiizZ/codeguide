/**
 * Created by PaiizZ on 3/2/2017 AD.
 */
public class Main {
    public static void main(String [] args){
        Shape s ;
        s = new Circle(3);
        System.out.println(String.format("%.2f",s.getArea()));
        System.out.println(String.format("%.2f",s.getPerimeter()));

        s = new Rectangle(2,3);
        System.out.println(String.format("%.2f",s.getArea()));
        System.out.println(String.format("%.2f",s.getPerimeter()));

        s = new Triangle(2,3);
        System.out.println(String.format("%.2f",s.getArea()));
        System.out.println(String.format("%.2f",s.getPerimeter()));

    }
}
