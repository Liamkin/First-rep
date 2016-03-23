package practice;

/**
 * Created by Слава on 08.03.2016.
 */
public class JoinCharacters {
    public int join(char[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++){
            result = result * 10 + Character.getNumericValue(input[i]);
        }
        return result;
    }
}