package practice;
import java.lang.Math;
/**
 * Created by Слава on 08.03.2016.
 */
public class SumDigits {
    public int sum(int number) {
        int result = 0;
        while (number != 0) {
            //Суммирование цифр числа
            result = result + (number % 10);
            number /= 10;
        }
        return Math.abs(result);
    }
}
