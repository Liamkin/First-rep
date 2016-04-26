package module5;

/**
 * Created by miroslavlyamkin on 29.12.15. Выводит минимальное и максимальное значение в массиве.
 */
public class Array{
    public static void main(String[] args) {

        int [] array = { 1, 7, 12, -2, 14, -11};

        int min = array[0];
        int max = array[0];


        for (int i = 0; i < array.length; i++) {

            if (min > array[i]){
                min = array[i];
            }

            if (max < array[i]){
                max = array[i];
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
