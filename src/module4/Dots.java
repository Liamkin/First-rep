package module4;

import java.util.Scanner;

/**
 * Created by miroslavlyamkin on 28.12.15.
 */
public class Dots {

    double x1;
    double y1;
    double x2;
    double y2;

    public double distance() {
        double result = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        return result;
    }

    public static void writer(Dots dots) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Set x1: ");
        if (scn.hasNextDouble()) {
            dots.x1 = scn.nextDouble();
        } else {
            System.out.println("You just input wrong. Please type only numeral");
        }

        System.out.println("Set y1: ");
        if (scn.hasNextDouble()) {
            dots.y1 = scn.nextDouble();
        } else {
            System.out.println("You just input wrong. Please type only numeral");
        }

        System.out.println("Set x2: ");
        if (scn.hasNextDouble()) {
            dots.x2 = scn.nextDouble();
        } else {
            System.out.println("You just input wrong. Please type only numeral");
        }

        System.out.println("Set y2: ");
        if (scn.hasNextDouble()) {
            dots.y2 = scn.nextDouble();
        } else {
            System.out.println("You just input wrong. Please type only numeral");
        }
    }
}
