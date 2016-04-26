package practice;

/**
 * Created by Слава on 11.04.2016.
 */
public class SetZero {
    public int set(int num, int i) {

        int mask = ~ (1 << i-1);
        int result = num & mask;
        return result;
    }
}