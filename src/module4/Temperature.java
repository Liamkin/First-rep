package module4;

import java.util.Scanner;

/**
 * Created by miroslavlyamkin on 28.12.15
 */
public class Temperature {

    static double temp;
    static String typeOfTemp;

    public double convert() {
        double convert = 0.0;
        if (typeOfTemp.equals("F")) {
            convert = (temp - 32) * 5 / 9;
        } else if (typeOfTemp.equals("C")) {
            convert = temp * 9 / 5 + 32;
        }
        return convert;
    }

    public static void writer(Temperature temperature) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Your temperature is F or C? ");
        String result = scn.nextLine();
        if (result.equals("F")) {
            typeOfTemp = "F";
        } else if (result.equals("C")) {
            typeOfTemp = "С";
        } else {
            System.out.println("Wrong input");
        }
        System.out.println("Type the temperature");
        temp = scn.nextDouble();

    }
}