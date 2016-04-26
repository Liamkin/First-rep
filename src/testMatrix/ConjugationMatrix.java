package testMatrix;

/**
 * Created by Слава on 23.03.2016.
 */
public class ConjugationMatrix { //это страшное название означает транспонирование матрицы
    public int[][] matrix(int input[][] ) {

        int [][] array = new int[input[0].length][input.length];

        for (int i = 0; i < input[0].length; i++){
            for (int j = 0; j < input.length; j++){
                array[i][j] = input[j][i];
            }

        }
    return array;
    }
}
