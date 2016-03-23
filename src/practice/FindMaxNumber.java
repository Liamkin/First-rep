package practice;

/**
 * Created by Слава on 08.03.2016.
 */
public class FindMaxNumber {
    public int max(int[] input) {
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            if (max < input[i])
                max = input[i];
        }
        return max;
    }
}
