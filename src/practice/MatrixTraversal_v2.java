package practice;

/**
 * Created by Слава on 21.03.2016.
 */
public class MatrixTraversal_v2 {
    public int[] print(int[][] input) {

        int h = input.length;
        int w = input[0].length;
        int top = 0, left = 0, right = w - 1, bottom = h - 1;

        int[] result = new int[h*w];
        int index = 0;

        while (right >= left & bottom >= top) {

            if(right >= left & bottom >= top) {
                for (int i = left; i <= right; i++) {
                    result[index] = input[top][i];
                    index++;
                }
                top++;
            }

            if(right >= left & bottom >= top) {
                for (int i = top; i <= bottom; i++) {
                    result[index] = input[i][right];
                    index++;
                }
                right--;
            }

            if(right >= left & bottom >= top) {
                for (int i = right; i >= left; i--) {
                    result[index] = input[bottom][i];
                    index++;
                }
                bottom--;
            }

            if(right >= left & bottom >= top) {
                for (int i = bottom; i >= top; i--) {
                    result[index] = input[i][left];
                    index++;
                }
                left++;
            }

        }
        return result;

    }
}