package testMatrix;

import java.util.Arrays;

/**
 * Created by Слава on 23.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        ZapolnenieMassiva test = new ZapolnenieMassiva();

        int height = 3;
        int width = 4;

        int[][] res = test.matrix(height, width); // доступ к методу

        for (int i = 0; i < res.length; i++) { // вывод готового массива
            System.out.println(Arrays.toString(res[i]));
        }

        ConjugationMatrix array = new ConjugationMatrix();

        int[][] ser = array.matrix(res);

        for (int i = 0; i < res.length; i++) { // вывод готового массива
            System.out.println(Arrays.toString(ser[i]));
        }


    }
}
