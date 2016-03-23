package practice;

import java.util.Arrays;

/**
 * Created by Слава on 08.03.2016.
 */
public class Main {
    public static void main(String[] args) {
//        SumDigits test = new SumDigits();
//        int result = test.sum(-2147483648);
//        long resul1 = test.sum1(-2147483648);
//        System.out.println(result + " " + resul1);

        MatrixTraversal test = new MatrixTraversal();
        int[][] matrix = {
                {1,}
        };

        int[] res = test.print(matrix);
        System.out.println(Arrays.toString(res));
    }
}
