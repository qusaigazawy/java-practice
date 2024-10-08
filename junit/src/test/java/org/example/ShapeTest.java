package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        c.calculatePerimeter(4);
        assertEquals(25.132741228718345, c.getPerimeter());
    }
}


class SquareTest {

    @Test
    void getAreaTest() {
        Square s = new Square();
        s.calculateArea(4);
        assertEquals(16.0, s.getArea());

    }

    @Test
    void getPerimeterTest() {
        Square s = new Square();
        s.calculatePerimeter(4);
        assertEquals(16.0, s.getPerimeter());
    }
}

class TriangleTest {

    @Test
    void getAreaTest() {
        Triangle t = new Triangle();
        t.calculateArea(4);
        assertEquals(6.928203230275509, t.getArea());

    }

    @Test
    void getPerimeterTest() {
        Triangle t = new Triangle();
        t.calculatePerimeter(4);
        assertEquals(12.0, t.getPerimeter());
    }
}