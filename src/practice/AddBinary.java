package practice;

/**
 * Created by Слава on 26.03.2016.
 *
 * Бінарне Додавання

 Додайте два беззнакових числа, що передаються як рядки.
 "101" + "100" = "1001"
 */
public class  AddBinary {
    String add(String a, String b) {
        StringBuilder result = new StringBuilder();
        int a0 = a.length();
        int b0 = b.length();

        int i = 0; //переменная для отсчета итераций до окончания длинн стрингов
        int temp = 0;
        while (i <a0 || i < b0) {

            //следующее условие не дает одной строке "закончиться" раньше, чем другой
            char aTemp = i < a0 ? a.charAt(a0 - 1 - i) : '0';
            char bTemp = i < b0 ? b.charAt(b0 - 1 - i) : '0';

            if (aTemp == bTemp) {
                result.append(Integer.toString(temp));
                temp = Character.getNumericValue(aTemp);
            }
            if (aTemp != bTemp) {
                result.append(Integer.toString(1 - temp));
            }
            i++;
        }

        if (temp == 1) { result.append('1'); }

        //перевернем содержимое стрингбилдера

        return result.reverse().toString();
    }
}