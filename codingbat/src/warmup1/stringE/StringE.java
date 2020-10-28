package warmup1.stringE;

public class StringE {

    /*
    CHALLENGE
    Return true if the given string contains between 1 and 3 'e' chars.
     */

    public static void main(String[] args) {

        stringE("Hello"); //true
        stringE("Heelle"); //true
        stringE("Heelele"); //false
    }

    public static boolean stringE(String str) {

        int occurences = 0;

        for (int i = 0; i < str.length(); i++){

            if (str.charAt(i) == 'e'){
                occurences +=1;
            }
        }
        return (occurences >= 1 && occurences <=3);
    }
}
