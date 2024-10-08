package org.example;
import javax.naming.directory.InvalidAttributesException;


class Square extends Shape {
    double area;
    double perimeter;
    double side;
    boolean isAreaCalculated = false;
    boolean isPerimeterCalculated = false;

    public void setSide(double side) {
        this.side = side;
        if (this.side != side) {
            this.isAreaCalculated = false; // reset
            this.isPerimeterCalculated = false; // reset
        }
    }

    public double calculateArea() {
        try {
            if (this.side > 0) {
                this.area = side * side;
                this.isAreaCalculated = true;

                return this.area;
            } else throw new InvalidAttributesException("Side can not be below or equal to zero");
        } catch (Exception e) {
            System.out.println("Invalid attribute: " + e);
        }
        return -1;
    }

    public double calculateArea(double side) {
        this.side = side;

        return this.calculateArea();
    }

    public double calculatePerimeter() {
        try {
            if (this.side > 0) {
                this.perimeter = 4 * this.side;
                this.isPerimeterCalculated = true;

                return this.perimeter;
            } else throw new InvalidAttributesException("Side can not be below or equal to zero");
        } catch (Exception e) {
            System.out.println("Invalid attribute: " + e);
        }

        return -1;
    }

    public double getArea()   {
        if (this.isAreaCalculated) {
            return this.area;
        } else throw new IllegalStateException("Area is not calculated yet!");
    }

    public double getPerimeter()
    {
        if (this.isPerimeterCalculated) {
            return this.perimeter;
        } else throw new IllegalStateException("Perimeter is not calculated yet!");
    }

}
