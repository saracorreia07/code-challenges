package warmup1.backAround;

public class BackAround {

    /*
    CHALLENGE
    Given a string, take the last char and return a new string with the last char added at the front and back,
    so "cat" yields "tcatt".
    The original string will be length 1 or more.
     */

    public static void main(String[] args) {

        backAround("cat"); //"tcatt"
        backAround("Hello"); //"oHelloo"
        backAround("a"); //"aaa"
    }

    public static String backAround(String str) {

        String lastChar = str.substring(str.length() - 1);

        String newWord = lastChar.concat(str + lastChar);

        return newWord;
    }
}
