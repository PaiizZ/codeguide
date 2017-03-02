/**
 * Created by PaiizZ on 3/2/2017 AD.
 */
public class Rectangle implements Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return getWidth()*getLength();
    }

    @Override
    public double getPerimeter() {
        return 2*getLength()+2*getWidth();
    }
}
