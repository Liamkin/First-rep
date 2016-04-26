package practice;

/**
 * Created by Слава on 13.04.2016.
 */
public class BitsPalindrome {
    public boolean isPalindrome(int input) {
        int reverse = 0;
        int temp = input;
        for (int i=0; i<32; i++){
            reverse <<= 1;
            reverse |= (temp&1);
            temp >>>= 1;
        }
        return input == reverse;
    }
}
