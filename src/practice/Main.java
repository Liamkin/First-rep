package practice;

/**
 * Created by Слава on 08.03.2016.
 */
public class Main {
    public static void main(String[] args) {
//        SumDigits test = new SumDigits();
//        int result = test.sum(-2147483648);
//        long resul1 = test.sum1(-2147483648);
//        System.out.println(result + " " + resul1);

//        MatrixTraversal test = new MatrixTraversal();
//        int[][] matrix = {
//                {1,}
//        };

//        int[] res = test.print(matrix);
//        System.out.println(Arrays.toString(res));

//        String s = "fgdebcanolfmjkhivutsrqpyxfgdebcanolmjkhivutsrqpyxfgdebcanolmjkhivutsrqpyxfgdebcanolmjkhivutsrqpyxf";
//        FirstUniqueCharacter test = new FirstUniqueCharacter();
//        char zzz = test.find(s);
//        System.out.println(zzz);

//        String a = "101";
//        String b = "100000";
//        AddBinary test = new AddBinary();
//        String x = test.add(a,b);
//        System.out.println(x);

//        int input = -2147483647;
//        CountBits test = new CountBits();
//        int x = test.count(input);
//        System.out.println(x);

//        int input = -2147483647;
//        BitsPalindrome test = new BitsPalindrome();
//        boolean bool = test.isPalindrome(input);
//        System.out.println(bool);

//        int a = 2147483647;
//        int b = 2147483647;
//        AverageNumber test = new AverageNumber();
//        int x = test.average(a,b);
//        System.out.println(x);


//        String a = "z";
//        String b = "1";
//        AddNumberBase36 test = new AddNumberBase36();
//        String x = test.add(a,b);
//        System.out.println(x);


        int[] input = {0, 0, 0, 8, 0, 0,};
        LonelyNumber test = new LonelyNumber();
        int x = test.find(input);
        System.out.println(x);
    }
}
