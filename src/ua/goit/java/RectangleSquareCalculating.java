package ua.goit.java;

/**
 * Created by 7 on 04.04.2016.
 */
public class RectangleSquareCalculating {
      public static double rectangleSquareCalculating(String SideAOfRectangle, String SideBOfRectangle) {
          final int IntSideAOfRectangle = Integer.parseInt(SideAOfRectangle);
          final int IntSideBOfRectangle = Integer.parseInt(SideBOfRectangle);
          double RectangleSquare;
          RectangleSquare = IntSideAOfRectangle*IntSideBOfRectangle;
          System.out.println("Square Area is = "+RectangleSquare);
          return RectangleSquare;
      }

}
