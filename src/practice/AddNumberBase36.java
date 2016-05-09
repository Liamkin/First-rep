package practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Додавання за основою 36

 Дано 2 числа в системі числення з основою 36. Будь-яка цифра може бути в межах [0-9a-z].
 Повернути суму чисел, також в системі 36.
 Наприклад:
 "9" + "1" = "a"
 "z" + "1" = "10"
 */
public class AddNumberBase36 {

    public String add(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int a0 = a.length();
        int b0 = b.length();

        StringBuilder result = new StringBuilder();

        final char[] Base36 = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h',
                'i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        //реализация через Map по ASCII
        Map<Character,Integer> base036 = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            base036.put((char) ('0'+ i),i);
        }
        for (int i = 0; i < 26; i++) {
            base036.put((char)('a'+i),i+10);
            base036.put((char)('A'+i),i+10);
        }

        int i = 0;
        int tempMemory = 0;
        StringBuilder temp = new StringBuilder();
        while (i <a0 || i < b0 || tempMemory > 0) {
            int ndx;
            char aTemp = i < a0 ? a.charAt(a0 - 1 - i) : '0';
            char bTemp = i < b0 ? b.charAt(b0 - 1 - i) : '0';

            int numA =0;
            while (aTemp != Base36[numA]) {
                numA++;
            }

            int numB =0;
            while (bTemp != Base36[numB]) {
                numB++;
            }

            ndx = numA+numB+tempMemory;

            if (ndx >= 36) {
                ndx -= 36;
                tempMemory = 1;
            } else {
                tempMemory = 0;
            }

            result.append(Base36[ndx]);
            i++;
        }

        return result.reverse().toString();
    }
}
