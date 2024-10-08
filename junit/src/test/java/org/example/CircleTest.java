package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void getAreaTest() {
        Circle c = new Circle();
        c.calculateArea(4);
        assertEquals(50.26548245743669, c.getArea());
    }

    @Test
    void getPerimeterTest() {
        Circle c = new Circle();
        c.setRadius(4);
        c.calculatePerimeter();
        assertEquals(25.132741228718345, c.getPerimeter());
    }
}
