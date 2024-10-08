package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TriangleTest {

    @Test
    void getAreaTest() {
        Triangle t = new Triangle();
        t.calculateArea(4);
        assertEquals(6.928203230275509, t.getArea());
        assertThrows(IllegalStateException.class, () -> t.calculateArea(-19));
        assertThrows(IllegalStateException.class, () -> {
            t.setSide(-2);
            t.getArea();
        });

    }


    @Test
    void getPerimeterTest() {
        Triangle t = new Triangle();
        t.setSide(4);
        t.calculatePerimeter();
        assertEquals(12.0, t.getPerimeter());
        assertThrows(IllegalStateException.class, () -> {
            t.setSide(0);
            t.getPerimeter();
        });
    }
}