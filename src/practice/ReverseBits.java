package practice;

/**
 * Created by Слава on 11.04.2016.
 */
public class ReverseBits {
    public int reverse(int input) {
        int result = 0;

        for (int i=0; i<=31; i++) {
            result <<=1;
            result |=(input & 1);
            input >>>=1;
        }
        return result;
    }
}
