package module5;

import java.util.Arrays;

/**
 * Created by miroslavlyamkin on 30.12.15. Программа сортирует массив методом вставок.
 */
public class InsertionSort {
    public static void main(String[] args) {

        int [] insSortArray = {1,4,-7,12,8,-3,0,0,-11,10};

        for (int i = 1; i < insSortArray.length; i++) { // Начиная со второго числа...

            for (int j = i; j > 0; j--) {               // ...мы сравниваем его с каждым предыдущим
                                                        // Таким образом получая наименьшее число в начале массива

                if  (insSortArray[j] < insSortArray[j-1]) {
                    int result = insSortArray[j];
                    insSortArray[j] = insSortArray[j-1];
                    insSortArray[j-1] = result;
                }
            }
        }
        System.out.println(Arrays.toString(insSortArray));
    }
}
