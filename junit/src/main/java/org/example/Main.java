package org.example;
import javax.naming.directory.InvalidAttributesException;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Circle c = new Circle();
        Square s = new Square();


        // TRIANGLE:

        try {
            System.out.println("Triangle's uncalculated area is: " + t.getArea());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            System.out.println("Triangle's uncalculated perimeter is: " + t.getPerimeter());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        // SQUARE:

        try {
            System.out.println("Square's uncalculated area is: " + s.getArea());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        try {
            System.out.println("Square's uncalculated perimeter is: " + s.getPerimeter());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        // CIRCLE:

        try {
            c.setRadius(-2);
            System.out.println("Circle's uncalculated area is: " + c.getArea());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        

        try {
            System.out.println("Circle's uncalculated perimeter is: " + c.getPerimeter());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        // Setting values

        // TRIANGLE
        t.setSide(4);
        t.calculateArea();
        t.calculatePerimeter();
        System.out.println("Triangle's area is: " + t.getArea());
        System.out.println("Triangle's area is: " + t.getPerimeter());


        // Circle
        c.setRadius(4);
        c.calculateArea();
        c.calculatePerimeter();
        System.out.println("Circle's area is: " + c.getArea());
        System.out.println("Circle's perimeter is: " + c.getPerimeter());


        // SQUARE
        s.setSide(4);
        s.calculateArea();
        s.calculatePerimeter();
        System.out.println("Triangle's area is: " + s.getArea());



//        Square s = new Square();
//        System.out.println("The are of the square is: " + s.calculateArea(4));
//        System.out.println("The perimeter of the square is: " + s.calculatePerimeter());
//        System.out.println("Square's area is: " + s.getArea());
//        System.out.println("Square's perimeter is: " + s.getPerimeter());
//
//
//        Circle c = new Circle();
//        c.calculateArea(4);
//        c.calculatePerimeter(4);
//        System.out.println("Circle's area is: " + c.getArea());
//        System.out.println("Circle's perimeter is: " + c.getPerimeter());




    }
}

/*
Square Area: 16.0
Square Perimeter: 16.0
Circle Area: 50.26548245743669
Circle Perimeter: 25.132741228718345
 */
