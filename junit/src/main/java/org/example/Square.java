package org.example;
import javax.naming.directory.InvalidAttributesException;


class Square extends Shape {
    private double area;
    private double perimeter;
    private double side;
    private boolean isAreaCalculated = false;
    private boolean isPerimeterCalculated = false;

    public void setSide(double side) {
        if (checkAttribute(side)) this.side = side; // Not really sure if I should add the try catch here or in main, would like to hear your advice on that.
        else throw new IllegalStateException("Side can not be smaller than zero or equal to 0");

        if (this.side != side) {
            this.isAreaCalculated = false; // reset
            this.isPerimeterCalculated = false; // reset
        }
    }

    public double calculateArea() {

            this.area = this.side * this.side;
            this.isAreaCalculated = true;

            return this.area;

        }

    public double calculateArea(double side) {
        if (checkAttribute(side)) this.side = side;
        else throw new IllegalStateException("Side could not be smaller than or equal to zero!"); // Should I add try catch here or in main? Would like to hear your advice on that.

        return this.calculateArea();
    }

    public double calculatePerimeter() {
                this.perimeter = 4 * this.side;
                this.isPerimeterCalculated = true;

                return this.perimeter;
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
