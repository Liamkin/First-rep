package module4;

import java.util.Scanner;

/**
 * Еле-еле созданная первая программа с хоть минимальным смыслом.
 * Вычисляет площадь треугольника по вводимым сторонам
 */
public class Triangle {

    double Side1;
    double Side2;
    double Side3;

    public double area() {
        double HalfPerimeter = (Side1 + Side2 + Side3) / 2;
        double result = Math.sqrt(HalfPerimeter * (HalfPerimeter - Side1) * (HalfPerimeter - Side2) * (HalfPerimeter - Side3));
        return result;
    }

    public static void writer(Triangle triangle){
        Scanner scn = new Scanner(System.in); // Создаем объект класса Scanner

        System.out.println("Set the lenth of First side of triangle: ");
        if (scn.hasNextDouble()) {
            triangle.Side1 = scn.nextDouble();
        } else {
            System.out.println("You just input wrong. Please type only numeral");
        }

        System.out.println("Set the lenth of Second side of triangle: ");
        if (scn.hasNextDouble()) {
            triangle.Side2 = scn.nextDouble();
        } else {
            System.out.println("You just input wrong. Please type only numeral");
        }

        System.out.println("Set the lenth of Third side of triangle: ");
        if (scn.hasNextDouble()) {
            triangle.Side3 = scn.nextDouble();
        } else {
            System.out.println("You just input wrong. Please type only numeral");
        }

    }
}