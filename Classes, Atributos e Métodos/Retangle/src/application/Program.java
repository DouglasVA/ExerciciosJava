package application;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        double areaRectangle = rect.area();
        double perimeterRectangle = rect.perimeter();
        double diagonalRectangle = rect.diagonal();

        System.out.printf("Area: %.2f", areaRectangle);
        System.out.printf("%nPerimeter: %.2f", perimeterRectangle);
        System.out.printf("%nDiagonal: %.2f", diagonalRectangle);

        sc.close();

    }

}
