package org.example;
import javax.naming.directory.InvalidAttributesException;



class Triangle extends Shape {
    private double area;
    private double perimeter;
    private double side;
    private boolean isAreaCalculated = false;
    private boolean isPerimeterCalculated = false;

    public void setSide(double side) {
        if (checkAttribute(side)) this.side = side;
        else throw new IllegalStateException("Side can not be smaller than or equal to zero!");

        if (this.side != side) {
            this.isAreaCalculated = false; // to reset
            this.isPerimeterCalculated = false; // to reset
        }

    }

    public double calculatePerimeter() {
        try {
                this.perimeter = 3 * this.side;
                this.isPerimeterCalculated = true;

                return this.perimeter;
        } catch (Exception e) {
            System.out.println("Invalid attribute: " + e);
        }

        return -1;
    }

    public double calculateArea() {
                this.area = (Math.sqrt(3) / 4) * this.side * this.side;
                this.isAreaCalculated = true;

                return this.area;
    }

    public double calculateArea(double side) {
        if (checkAttribute(side)) this.side = side;
        else throw new IllegalStateException("Side could not be smaller than or equal to zero!"); // Should I add try catch here or in main? Would like to hear your advice on that.

        return this.calculateArea();
    }

    double getArea()
    {
        if (this.isAreaCalculated) {
            return this.area;
        }
        else
            throw new IllegalStateException("Area is not calculated!");

    }


    double getPerimeter(){
        if (this.isPerimeterCalculated) {
            return this.perimeter;
        } else throw new IllegalStateException("Perimeter is not calculated!");
    }
}

