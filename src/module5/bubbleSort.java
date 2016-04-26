package module5;

import java.util.Arrays;

/**
 * Created by miroslavlyamkin on 30.12.15. Программа сортирует массив методом пузырьковой сортировки
 */
public class bubbleSort {
    public static void main(String[] args) {

        int [] BubbleSort = {1,4,-7,12,8,-3,0,0,-11,10};

        for (int i = 1; i < BubbleSort.length - 1; i++) {
            //Делаем по одному проходу для каждого числа в массиве -
            // после первого прохода гарантированно последнее число будет самым большим,
            // И так далее, пока не отсортируются все числа

            for (int j = 0; j < BubbleSort.length -1; j++) {
                // Каждый проход подразумевает поочередную проверку соседних чисел на больше-меньше

                if (BubbleSort[j+1] < BubbleSort[j]){
                    // если следующее в массиве число меньше, чем предыдущее, то они меняются местами
                    int result = BubbleSort[j];
                    BubbleSort[j] = BubbleSort[j+1];
                    BubbleSort[j+1] = result;
                }
            }
        }
        System.out.println(Arrays.toString(BubbleSort));
    }
}
