package practice;

/**
 * Created by Слава on 11.04.2016.
 */
public class ReverseBitsFirstTry {
    public int reverse(int input) {
        int result;
        StringBuilder temp = new StringBuilder();
        temp.append(Integer.toString(input,2));
        temp.reverse();
        while( temp.length()<=32 ) {
            temp.append("0");
        }
        result = Integer.parseInt(temp.toString(), 2);
    return result;
    }
}