package warmup2.stringX;

public class StringX {

    /*
    CHALLENGE
    Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.
     */

    public static void main(String[] args) {

        stringX("xxHxix"); //"xHix"
        stringX("abxxxcd"); //"abcd"
        stringX("xabxxxcdx"); //"xabcdx"
    }

    public static String stringX(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++){

            if((i == 0) && (str.charAt(i) == 'x')) {
                result += str.charAt(i);
            }

            if (str.charAt(i) != 'x') {
                result += str.charAt(i);
            }

            if((i == str.length() - 1) && (i != 0) && (str.charAt(i) == 'x')){
                result += str.charAt(i);
            }
        }
        return result;
    }
}
