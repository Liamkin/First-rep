package testMatrix;

/**
 * Created by Слава on 23.03.2016.
 */
public class ZapolnenieMassiva {
    public int[][] matrix(int height, int width) {

        int [][] array = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = (int) Math.round(Math.random() * 100);
            }
        }
    return array;
    }
}
