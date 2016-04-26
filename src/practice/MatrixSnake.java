package practice;

/**
 * Created by Слава on 24.03.2016.
 */
public class MatrixSnake {
    public int[] print(int[][] input) {
        int h = input.length;
        int w = input[0].length;
        int size = 0;
        int[] result = new int[h*w];

        for (int i = 0; i < w; i++){
            for (int j = 0; j < h; j++) {
               if (i%2 == 0) {
                   result[size] = input[j][i];
               } else {
                   result[size] = input[h-1-j][i];
               }
                size++;
            }
        }
    return result;
    }
}
