package module9;


/**
 * Created by miroslavlyamkin on 24.02.16.
 */
public class CaesarsEncrypt {

    protected static final int n = 26;
    protected static char[] upper = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N', 'O','P','Q',
            'R','S','T','U','V','W','X','Y','Z'};
    protected static char[] lower = {'a','b','c','d','e','f','g','h',
            'i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    private String output;
    private int k;

    public static int findIndUpper(char c){
        int rez = -1;

        for(int i=0; i<upper.length; ++i){
            if(c == upper[i]) rez = i;
        }
        return rez;
    }

    public static int findIndLower(char c){
        int rez = -1;

        for(int i=0; i<lower.length; ++i){
            if(c == lower[i]) rez = i;
        }
        return rez;
    }


    public CaesarsEncrypt(StringBuilder text, int k) {
        this.k = k;
        StringBuilder output = new StringBuilder();

        for(int i=0; i<text.length(); ++i){
            char c = text.charAt(i);

            if (findIndUpper(c) != -1) {
                int y = (findIndUpper(c) + k) % n;
                output.append(upper[y]);
            }
            if (findIndLower(c) != -1) {
                int y = (findIndLower(c) + k) % n;
                output.append(lower[y]);
            }
            if((findIndUpper(c) == -1) && (findIndLower(c) == -1)){
                output.append(c);
            }

        }
        this.output = output.toString();
    }

    public String getEncText(){
        return this.output;
    }
//    public int getK(){
//        return this.k;
//    }



}

