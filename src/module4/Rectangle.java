package module4;

import java.util.Scanner;

/**
 * Created by miroslavlyamkin on 28.12.15.
 */
public class Rectangle {

    double SideA;
    double SideB;

    public double area() {
       double result = SideA * SideB;
        return result;
    }

    public static void writer(Rectangle rectangle) {
        Scanner scn = new Scanner(System.in); // Создаем объект класса Scanner

        System.out.println("Set the one side of a rectangle: ");
        if (scn.hasNextDouble()) {
            rectangle.SideA = scn.nextDouble();
        } else {
            System.out.println("You just input wrong. Please type only numeral");
        }

        System.out.println("Set the second side of a rectangle: ");
        if (scn.hasNextDouble()) {
            rectangle.SideB = scn.nextDouble();
        } else {
            System.out.println("You just input wrong. Please type only numeral");
        }
    }
}