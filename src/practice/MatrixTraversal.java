package practice;

/**
 * Created by Слава on 15.03.2016.
 */
public class MatrixTraversal {
    public int[] print(int[][] input) {

        int h = input.length;
        int w = input[0].length;
        int size = 0;
        int top=0, right=w-1, left=0, bottom=h-1;

        int[] result = new int[h*w];

        do {

            for (int i = left; i < right; i++) {
                if (size == h * w){
                    break;
                }
                result[size] = input[top][i];
                size++;
            }
            for (int i = top; i < bottom; i++) {
                if (size == h * w){
                    break;
                }
                result[size] = input[i][right];
                size++;
            }
            for (int i = right; i > left; i--) {
                if (size == h * w){
                    break;
                }
                result[size] = input[bottom][i];
                size++;
            }
            for (int i = bottom; i > top; i--) {
                if (size == h * w){
                    break;
                }
                result[size] = input[i][left];
                size++;
            }
            top++;
            right--;
            left++;
            bottom--;
        } while (size < h*w);

    return result;
    }
}
