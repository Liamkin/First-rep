package module9;
import module3.files.Audio;
import module3.files.File;
import module3.files.Image;
import module3.files.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miroslavlyamkin on 24.02.16.
 */
public class Main {
    public static void main(String[] args) {
        int k = 4;
        //  For inputting word of phrase
//----------------------------------------------------------------------------------------------------------------------
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Please enter the word which you would like to encrypt: ");
//        text = scan.nextLine();
//        System.out.print("Thank\'s a lot. Now please enter points of shift: ");
//        shift = scan.nextInt();
//----------------------------------------------------------------------------------------------------------------------
        StringBuilder name = new StringBuilder();
        List<File> files = new ArrayList<>();

        files.add(new File(4096,"file",011));
        files.add(new Image(1536,"image",1));
        files.add(new Audio(2048,"audio",2));
        files.add(new Text(512,"text",3));

        for (int x = 0; x < files.size(); x++) {
            name = name
                    .append(files.get(x).getAge())
                    .append(" ")
                    .append(files.get(x).getName())
                    .append(" ")
                    .append(files.get(x).getSize())
                    .append(" ");
        }
//        name.toString();  // we no longer need to do this because of new version of IDEA solved this issue

    CaesarsEncrypt encrypt = new CaesarsEncrypt(name,k);

        System.out.println("Our  start  phrase  is:       " + name);
        System.out.println("After encoding we have:       " + encrypt.getEncText());

    }
}
