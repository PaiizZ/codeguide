# Code Guide

## Polymorphism
#####Polymorphism is the capability of a method to do different things based on the object that it is acting upon. In other words, polymorphism allows you define one interface and have multiple implementations. I know it sounds confusing. Don’t worry we will discuss this in detail.

- It is a  feature that allows one interface to be used for a general class of  actions.
- An operation may exhibit different behavior in different instances.
- The behavior depends on the types of data used in the operation.
- It plays an important role in allowing objects having different internal structures to share the same external interface.
- Polymorphism is extensively used in implementing inheritance.
```Java
public interface Shape {
   double getArea();
   double getPerimeter();
}
```

`Shape` is an `interface` which guarantees that all of its realizers (or implementers) should be able to provide the `getArea()` and `getPerimeter()` methods.

```Java
public class Rectangle implements Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}
```

```Java
public class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(base / 2, 2) + Math.pow(height, 2)) * 2 + base;
    }
}
```

The `Rectangle` and `Triangle` classes are realizing the `Shape` interface, therefore both of them have their own implementation of the `getArea()` and `getPerimeter()` methods.

Polymorphism here is that when we use these `Shape`s, we don't care if it's a `Rectangle` or a `Triangle`, we just know that all of them are `Shape`, therefore we should be able to use `getArea()` and `getPerimeter()` without having to concern with the underlying implementations.
```Java
List<Shape> shapes = new ArrayList<>();

shapes.add(new Rectangle(1, 2));
shapes.add(new Triangle(2, 1));

for (Shape shape : shapes) {
    System.out.println("Area: " + shape.getArea());
    System.out.println("Perimeter: " + shape.getPerimeter());
    System.out.println();
}
```

## Inheritance
#####Inheritance is one of the feature of Object-Oriented Programming (OOPs). Inheritance allows a class to use the properties and methods of another class. In other words, the derived class inherits the states and behaviors from the base class. The derived class is also called subclass and the base class is also known as super-class. The derived class can add its own additional variables and methods. These additional variable and methods differentiates the derived class from the base class.
```Java
public class LandVehicle {
    private String id;
    private String name;
    private String licenseNumber;
    private int wheels;

    public LandVehicle(String id, String name, String licenseNumber, int wheels) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.wheels = wheels;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String toString() {
        return String.format("Id: %s, Name: %s, License number: %s", getId(), getName(), getLicenseNumber());
    }
}
```
```Java
public class TwoWheeler extends LandVehicle {

    private SteeringHandle steeringHandle;

    public TwoWheeler(String id, String name, String licenseNumber, SteeringHandle steeringHandle) {
        super(id, name, licenseNumber, 2);
        this.steeringHandle = steeringHandle;
    }

    public void ride() {
        System.out.println("Let's ride");
    }
}
```

```Java
public class FourWheeler extends LandVehicle {

    private SteeringWheel steeringWheel;

    public FourWheeler(String id, String name, String licenseNumber, SteeringWheel steeringWheel) {
        super(id, name, licenseNumber, 4);
        this.steeringWheel = steeringWheel;
    }

    public void drive() {
        System.out.println("Let's drive");
    }
}
```

Here `TwoWheeler` and `FourWheeler` are subclasses of `LandVehicle`, so both of them should be able act as a `LandVehicle`, for example, you can `getName()` or `getLicenseNumber()` from a `TwoWheeler` in the same way that you can do it to any `LandVehicle`. But each of the subclasses also have their own behavior which distinguish them apart from each other, here you `ride()` a `TwoWheeler` while on a `FourWheeler` you `drive()` it instead.