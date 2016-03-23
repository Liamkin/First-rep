package practice;
import java.lang.Math;
/**
 * Created by Слава on 08.03.2016.
 */
public class SumDigits {
    public int sum(int number) {
        if (number > 2)

        number = Math.abs(number);
        String digits = Integer.toString(number);
        int x = 0;

        for (int i = 0; i < digits.length(); ++i) {
            x = x + Character.getNumericValue(digits.charAt(i));
        }
        return x;
    }
    public static long sum1(int number) {
        int result = 0;
        while (number != 0) {
            //Суммирование цифр числа
            result = result + (number % 10);
            number /= 10;
        }
        return Math.abs(result);
    }
}
