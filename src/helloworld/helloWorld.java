package helloworld;
import firstobject.firstclass;

/**
 * Created by miroslavlyamkin on 27.01.16.
 *
 * Создано с помощью инструкции по адресу
 * http://gooodjava.blogspot.com/2013_07_01_archive.html
 */
public class helloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

        firstclass fcl1 = new firstclass();

        fcl1.setMem (256);
        fcl1.setName ("Gnusmas");
        fcl1.setRam (512);
        fcl1.setWeight (147);

            fcl1.on();
            fcl1.off();
            fcl1.load();


    }
}
