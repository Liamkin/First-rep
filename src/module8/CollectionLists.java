package module8;

import module3.files.Audio;
import module3.files.File;
import module3.files.Image;
import module3.files.Text;
import module3.flowers.Flower;
import module3.musicInstruments.MusicInstrument;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miroslavlyamkin on 01.02.16.
 *
 * Создать класс, который печатает созданные коллекции на экран в виде таблицы. Размерность списков может изменяться.
 */

public class CollectionLists {
    public static void main(String[] args) {

        List<File> files = new ArrayList<>();
        List<Flower> flowers = new ArrayList<>();                   //Создано исключительно показательно. Не применено
        List<MusicInstrument> musicInstruments = new ArrayList<>(); //Создано исключительно показательно. Не применено

        files.add(new File(4096,"file",8));
        files.add(new Image(1536,"image",1));
        files.add(new Audio(2048,"audio",2));
        files.add(new Text(512,"text",3));

        for (int x = 0; x < files.size(); x++) {
            System.out.print(files.get(x).getAge() + " ");
            System.out.print(files.get(x).getName() + " ");
            System.out.print(files.get(x).getSize());
            System.out.println();
        }
        System.out.println();
//        System.out.println(files.size());


        // Эта часть создана для сортировки пузырьком значения Age в массиве объектов. Порядок самих объектов не меняется
        // Надо ли его менять я так и не понял. В любом случае сложность задания это не повышает.
        for (int i = 1; i < files.size() - 1; i++) {
            for (int j = 0; j < files.size() -1; j++) {
                if (files.get(j+1).getAge() < files.get(j).getAge()) {
                    int result = files.get(j).getAge();
                    files.get(j).setAge(files.get(j+1).getAge());
                    files.get(j+1).setAge(result);
                }
            }
        }

        for (int x = 0; x < files.size(); x++) {
            System.out.print(files.get(x).getAge() + " ");
            System.out.print(files.get(x).getName() + " ");
            System.out.print(files.get(x).getSize());
            System.out.println();
            // Я обращаюсь к процедуре вывода дважды в программе. Стоит ли мне вынести ее в метод?
        }
    }
}
