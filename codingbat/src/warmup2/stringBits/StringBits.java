package warmup2.stringBits;

public class StringBits {

    /*
    CHALLENGE
    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
     */

    public static void main(String[] args) {

        stringBits("Hello"); //"Hlo"
        stringBits("Hi"); //"H"
        stringBits("Heeololeo"); //"Hello"
    }

    public static String stringBits(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i+=2){

            result += str.charAt(i);

        }
        return result;
    }
}
