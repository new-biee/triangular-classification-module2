package com.test;

import com.main.TriangleClassifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    public void testEquilateral() {
        int edgea = 2;
        int edgeb = 2;
        int edgec = 2;
        String expected = "Equilateral triangle";

        String result = TriangleClassifier.getTriangle(edgea, edgeb, edgec);
        assertEquals(expected, result);

    }

    @Test
    public void testIsosceles() {
        int edgea = 2;
        int edgeb = 2;
        int edgec = 3;
        String expected = "Isosceles triangle";

        String result = TriangleClassifier.getTriangle(edgea, edgeb, edgec);
        assertEquals(expected, result);

    }

    @Test
    public void testTriangle() {
        int edgea = 3;
        int edgeb = 4;
        int edgec = 5;
        String expected = "Triangle";

        String result = TriangleClassifier.getTriangle(edgea, edgeb, edgec);
        assertEquals(expected, result);

    }

    @Test
    public void testNotATriangle() {
        int edgea = 8;
        int edgeb = 2;
        int edgec = 3;
        String expected = "Not a triangle";

        String result = TriangleClassifier.getTriangle(edgea, edgeb, edgec);
        assertEquals(expected, result);
    }

    @Test
    public void testNotATriangle1() {
        int edgea = -1;
        int edgeb = 2;
        int edgec = 1;
        String expected = "Not a triangle";

        String result = TriangleClassifier.getTriangle(edgea, edgeb, edgec);
        assertEquals(expected, result);
    }

    @Test
    public void testNotATriangle2() {
        int edgea = 0;
        int edgeb = 1;
        int edgec = 1;
        String expected = "Not a triangle";

        String result = TriangleClassifier.getTriangle(edgea, edgeb, edgec);
        assertEquals(expected, result);
    }
}