package module4;

import java.util.Scanner;

/**
 * Created by miroslavlyamkin on 28.12.15.
 */
public class Circle {

    double radius;

    public double area(){
       double result = Math.pow(radius,2) * Math.PI;
        return result;
    }
    public static void writer(Circle circle) {
        Scanner scn = new Scanner(System.in); // Создаем объект класса Scanner

        System.out.println("Set the radius of a circle: ");
        if (scn.hasNextDouble()) {
            circle.radius = scn.nextDouble();
        } else {
            System.out.println("You just input wrong. Please type only numeral");
        }
    }
}
