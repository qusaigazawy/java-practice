package org.example;
import javax.naming.directory.InvalidAttributesException;


abstract class Shape {
    // I am really not sure if this below method is needed or not, would like to hear your advice on this.

    protected boolean checkAttribute(double attribute) {
        return attribute > 0;
    };

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

}

