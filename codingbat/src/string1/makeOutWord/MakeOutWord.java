package string1.makeOutWord;

public class MakeOutWord {

    /*
    CHALLENGE
    Given an "out" string length 4, such as "<<>>", and a word,
    return a new string where the word is in the middle of the out string, e.g. "<<word>>".
    Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
     */

    public static void main(String[] args) {

        makeOutWord("<<>>", "Yay"); //"<<Yay>>"
        makeOutWord("<<>>", "WooHoo"); //"<<WooHoo>>"
        makeOutWord("[[]]", "word"); //"[[word]]"
    }

    public static String makeOutWord(String out, String word) {

        String first = out.substring(0, 2);
        String last = out.substring(out.length() - 2);

        return first + word + last;
    }
}
