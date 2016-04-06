package ua.goit.java;

/**
 * Created by 7 on 04.04.2016.
 */
public class TriangleSquareCalculating {
    public static double triangleSquareCalculating(String SideAOfTriangle, String SideBOfTriangle) {
        final int IntSideAOfTriangle = Integer.parseInt(SideAOfTriangle);
        final int IntSideBOfTriangle = Integer.parseInt(SideBOfTriangle);
        double TriangleSquare;
        TriangleSquare = IntSideAOfTriangle*IntSideBOfTriangle/2;
        System.out.println("Area of a triangle is = "+TriangleSquare);
        return TriangleSquare;
    }
}
