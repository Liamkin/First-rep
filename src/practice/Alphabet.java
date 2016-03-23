package practice;

import java.util.HashSet;   // данная коллекция реализует математическое множество -
                            // массив уникальных значений без указания их расположения
import java.util.Set;

/**
 * Created by Слава on 09.03.2016.
 */
public class Alphabet {
    public boolean check(String input) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < input.length();i++){
            set.add(input.charAt(i));
        }
        for (int j = 0; j < 26; j++){
            if (!set.contains((char)('a'+ j)) && !set.contains((char)('A'+j)))
                //для возврата значения char нужна  процедура (char)('A'+j), иначе будет просто число
                return false;
        }
        return true;
    }
}
// команда contains
//Для указания алфавита не нужно указывать его весь - можно сослаться на ASCII