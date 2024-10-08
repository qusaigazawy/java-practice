package org.example;
import javax.naming.directory.InvalidAttributesException;


 class Circle extends Shape {

     private double area;
     private double perimeter;
     private double radius;
     private boolean isAreaCalculated = false;
     private boolean isPerimeterCalculated = false;

    public void setRadius(double radius) {
         if (checkAttribute(radius)) this.radius = radius;
         else throw new IllegalStateException("Side can not be smaller than zero or equal to 0");

         if (this.radius != radius) {
             this.isAreaCalculated = false; // to reset
             this.isPerimeterCalculated = false; // to reset
         }
    }

    public double calculateArea() {
        try {
            if (checkAttribute(this.radius)) {
                this.area = Math.PI * this.radius * this.radius;
                this.isAreaCalculated = true;
                return this.area;
            } else {
                throw new InvalidAttributesException("Radius can not be below or equal to zero");
            }
        } catch (Exception e) {
            System.out.println("Invalid attributes: " + e);
        }

        return -1;
    }

    //overload
     public double calculateArea(double radius) {
        this.radius = radius;
        return this.calculateArea();
     }

    public double calculatePerimeter() {
        try {
            if (this.radius > 0) {
                this.perimeter = 2 * Math.PI * this.radius;
                this.isPerimeterCalculated = true;
                return this.perimeter;
            } else {
                throw new InvalidAttributesException("Radius can not be below or equal to zero!");
            }
        } catch (Exception e) {
            System.out.println("Invalid attributes: " + e);
        }

        return -1;
    }

    // getters
    public double getArea()   {
        if (this.isAreaCalculated) {
            return this.area;
        } else throw new IllegalStateException("Area is not calculated!");
    }


    public double getPerimeter()  {
        if (this.isPerimeterCalculated) {
            return this.perimeter;
        } else throw new IllegalStateException("Perimeter is not calculated!");
    }

}