package com.main;

public class TriangleClassifier {
    public static String getTriangle(int edgea, int edgeb, int edgec) {
        String str = "";
        if (edgea <= 0 || edgeb <= 0 || edgec <= 0) {
            str = "Not a triangle";
        } else if ((edgea >= edgeb + edgec) || (edgeb >= edgea + edgec) || (edgec >= edgea + edgeb)) {
            str = "Not a triangle";
        } else if ((edgea == edgeb) && (edgeb == edgec) && (edgec == edgea)) {
            str = "Equilateral triangle";
        } else if ((edgea == edgeb) || (edgeb == edgec) || (edgec == edgea)) {
            str = "Isosceles triangle";
        } else if ((edgea + edgeb > edgec) || (edgea + edgec > edgeb) || (edgeb + edgec > edgea)) {
            str = "Triangle";
        }
        return str;
    }
}
