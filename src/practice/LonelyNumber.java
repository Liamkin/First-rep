package practice;

/**
 * Created by Слава on 09.05.2016.
 */
public class LonelyNumber {
    public int find(int[] input) {

        int[] mas = new int[32];
        int temp;

        for (int i=0; i<input.length; i++) {
            temp = input[i];

            for (int j=0; j<32; j++) {
                mas[j] += temp%2;
                temp >>>= 1;
            }
        }
        StringBuilder number = new StringBuilder();

        for (int i=0; i<32; i++) {
            mas[i] %= 5;
            number.append(mas[i]);
        }


        return Integer.parseInt(number.reverse().toString(),2);
    }
}
