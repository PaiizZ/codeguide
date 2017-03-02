/**
 * Created by PaiizZ on 3/2/2017 AD.
 */
public class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5*getBase()*getHeight();
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(base/2,2)+Math.pow(height,2))*2+base;
    }
}
