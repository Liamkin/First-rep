package practice;

/**
 * Created by Слава on 08.03.2016.
 */
public class AbcNumbers {
    public int convert(String num) {
        int result =0;

        for (int i = 0; i < num.length(); i++){
            char c = num.charAt(i);
            int digit = c - 'a';
            result = result *10 + digit;
        }
        return result;
    }
}
//  we can use ASCII and difference between symbol numbers in it.
//  in this case we don't need any alphabet for this task
//  int digit = c - 'a';