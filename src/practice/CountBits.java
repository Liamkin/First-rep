package practice;

/**
 * Created by Слава on 13.04.2016.

 Кількість біт

 Для даного числа порахувати кількість біт.
 Наприклад:
 Для числа 13 в бінарному вигляді 1101 повернути 3.
 */
public class CountBits {
    public int count(int num) {
        int counter = 0;
        while (num != 0) {
            if ((num&1) == 1){
                counter++;}
            num >>>=1;
        }
        return counter;
    }
}
