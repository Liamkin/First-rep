package module10;

import module9.CaesarsEncrypt;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Слава on 07.03.2016.
 */
public class TestingIO {
    public static void main(String[] args) throws IOException {
        int k = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello. Type some shit right here, please. I need to encrypt and save it somewhere: ");
        String what = scanner.nextLine();
        //if will you fuck up in writing whole Line  - the reason will be using   next() (it see only first word)
        StringBuilder name = new StringBuilder(what);
        CaesarsEncrypt encrypt = new CaesarsEncrypt(name, k); //i don't want to overwrite my method from last module :)
        what = encrypt.getEncText();
        FileWriter writer = new FileWriter("C:\\testing.txt", false); //and now i write this sh*t at memory
        writer.write(what);
        writer.flush(); // clean up buffer and write down the line into a file. I read about it at some forum :)

        File f = new File("C:\\testing.txt");
        FileReader reader = new FileReader(f);

        char[] buffer = new char[(int) f.length()];
        // read all file at once
        reader.read(buffer);
        System.out.print("This is our first part of 7th march hapiness: ");
        System.out.println(new String(buffer));

        //now we need to decode our result and print it again
        //why i didn't do decryptor at the time?? *crying*
        // Program is almost done, but
        //Предусмотреть обработку различных ошибок ввода/вывода.
    }
}
