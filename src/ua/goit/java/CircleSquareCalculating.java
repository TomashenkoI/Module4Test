package ua.goit.java;

/**
 * Created by 7 on 04.04.2016.
 */
public class CircleSquareCalculating {
    public static int circleSquareCalculating(String R) {
        final int radius = Integer.parseInt(R);
        int radius1 = radius;
        double CircleSquare;
        double Pi = 3.14d;
        CircleSquare = Pi*radius*radius;
        System.out.println("Area of a cirlce = "+CircleSquare);
        return 1;
    }
}
