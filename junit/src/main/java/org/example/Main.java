package org.example;

import javax.naming.directory.InvalidAttributesException;

abstract class Shape {
     abstract void calculateArea(int arg);

    abstract void calculateArea(double arg);

     abstract void calculatePerimeter(int arg);

}

class Circle extends Shape {
    double area;
    double perimeter;

    // setters
    void calculateArea(int radius) {
        try {
            if (radius > 0) {
                this.area = Math.PI * radius * radius;
            } else {
                throw new InvalidAttributesException("Radius can not be below or equal to zero");
            }
        } catch (Exception e) {
            System.out.println("Invalid attributes: " + e);
        }

    }

    void calculateArea(double radius) {
        try {
            if (radius > 0) {
                this.area = Math.PI * radius * radius;
            } else {
                throw new InvalidAttributesException("Radius can not be below or equal to zero");
            }
        } catch (Exception e) {
            System.out.println("Invalid attributes: " + e);
        }

    }

    void calculatePerimeter(int radius) {
        try {
            if (radius > 0) {
                this.perimeter = 2 * Math.PI * radius;
            } else {
                throw new InvalidAttributesException("Radius can not be below or equal to zero!");
            }
        } catch (Exception e) {
            System.out.println("Invalid attributes: " + e);
        }
    }

    // getters
    double getArea() {
        return this.area;
    }

    double getPerimeter() {
        return this.perimeter;
    }

}

class Square extends Shape {
    double area;
    int perimeter;

    void calculateArea(double side) {
        try {
            if (side > 0) {
                this.area = side * side;
            } else throw new InvalidAttributesException("Side can not be below or equal to zero");
        } catch (Exception e) {
            System.out.println("Invalid attribute: " + e);
        }
    }

    void calculateArea(int side) {
        try {
            if (side > 0) {
                this.area = side * side;
            } else throw new InvalidAttributesException("Side can not be below or equal to zero");
        } catch (Exception e) {
            System.out.println("Invalid attribute: " + e);
        }
    }

    void calculatePerimeter(int side) {
        try {
            if (side > 0) {
                this.perimeter = 4 * side;
            } else throw new InvalidAttributesException("Side can not be below or equal to zero");
        } catch (Exception e) {
            System.out.println("Invalid attribute: " + e);
        }
    }

    double getArea() {
        return this.area;
    }

    double getPerimeter()
    {
        return this.perimeter;
    }

}

class Triangle extends Shape {
    double area;
    double perimeter;
    void calculatePerimeter(int side) {
        try {
            if (side > 0) {
                this.perimeter = 3 * side;
            } else throw new InvalidAttributesException("Side can not be below or equal to zero");
        } catch (Exception e) {
            System.out.println("Invalid attribute: " + e);
        }
    }

    void calculateArea(int side) {
        try {
            if (side > 0) {
                this.area = (Math.sqrt(3) / 4) * side * side;;
            } else throw new InvalidAttributesException("Side can not be below or equal to zero");
        } catch (Exception e) {
            System.out.println("Invalid attribute: " + e);
        }
    }

    void calculateArea(double side) {
        try {
            if (side > 0) {
                this.area = (Math.sqrt(3) / 4) * side * side;;
            } else throw new InvalidAttributesException("Side can not be below or equal to zero");
        } catch (Exception e) {
            System.out.println("Invalid attribute: " + e);
        }
    }

    double getArea()
    {
        return this.area;
    }


    double getPerimeter(){
        return this.perimeter;
    }
}

public class Main {
    public static void main(String[] args) {
         Triangle t = new Triangle();
         t.calculateArea(4);
         t.calculatePerimeter(4);
         System.out.println("Triangle's area is: " + t.getArea());
         System.out.println("Triangle's perimeter is: " + t.getPerimeter());

         Square s = new Square();
        s.calculateArea(4);
        s.calculatePerimeter(4);
        System.out.println("Square's area is: " + s.getArea());
        System.out.println("Square's perimeter is: " + s.getPerimeter());


        Circle c = new Circle();
        c.calculateArea(4);
        c.calculatePerimeter(4);
        System.out.println("Circle's area is: " + c.getArea());
        System.out.println("Circle's perimeter is: " + c.getPerimeter());




    }
}

/*
Square Area: 16.0
Square Perimeter: 16.0
Circle Area: 50.26548245743669
Circle Perimeter: 25.132741228718345
 */