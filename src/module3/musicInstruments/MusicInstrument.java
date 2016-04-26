package module3.musicInstruments;

/**
 * Created by miroslavlyamkin on 24.12.15.
 */
public class MusicInstrument {
    public static void main(String[] args) {
        String[] musix = {"guitar", "piano", "trumpet", "balalayka"};
        System.out.println(musix[0]);
        try {
            System.out.println(musix[4]);
        } catch  (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no spoon :)");
        }
    }
}

class Guitar extends MusicInstrument {
}
class Piano extends MusicInstrument {
}
class Trumpet extends MusicInstrument {
}
class MusicShop {
    MusicInstrument musicInstrument;
}