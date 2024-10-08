package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SquareTest {

    @Test
    void getAreaTest() {
        Square s = new Square();
        s.calculateArea(4);
        assertEquals(16.0, s.getArea());
        assertThrows(IllegalStateException.class, () -> s.calculateArea(-9));
        assertThrows(IllegalStateException.class, () ->
        {
            s.setSide(-9);
            s.getArea();
        });
    }

    @Test
    void getPerimeterTest() {
        Square s = new Square();
        s.setSide(4);
        s.calculatePerimeter();
        assertEquals(16.0, s.getPerimeter());
        assertThrows(IllegalStateException.class, () -> {
            s.setSide(0);
            s.getPerimeter();
        });
    }
}
