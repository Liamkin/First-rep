package practice;

/**
 * Created by Слава on 26.03.2016.
 */
public class FirstUniqueCharacter {
    public Character find(String s) {
        char result = '\0';
        int i = 0;
        while (result == '\0' & i < s.length()) {
            int x = 0;  // способ проверить отсутствие повторов
            int j = 0;
            while (j < s.length() && x == j-1 | x == j){  // сравнивает текущую букву с остальными
                if (j != i) {                       // не дает сравнить букву с самой собой
                    if (s.charAt(i) != s.charAt(j)) {
                        x++;
                    }
                }
                j++;
            }
            if (x == s.length() - 1) {
                result = s.charAt(i);
            }
            i++;
        }
        if (result == '\0') {
            return null;
        } else {
            return result;
        }
    }
}

/*  сравниваем первый символ с остатком символов
     если повторяется, берем следующий символ и
     сравниваем на сходство с текущим
     если символы одинаковые - повторяем цикл
     если разные -
*/