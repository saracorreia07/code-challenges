package warmup2.frontTimes;

public class FrontTimes {

    /*
    CHALLENGE
    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    or whatever is there if the string is less than length 3. Return n copies of the front;
     */

    public static void main(String[] args) {

        frontTimes("Chocolate", 2); //"ChoCho"
        frontTimes("Chocolate", 3); //"ChoChoCho"
        frontTimes("Abc", 3); //"AbcAbcAbc"
    }

    public static String frontTimes(String str, int n) {

        String result = "";

        if(str.length() <= 3){

            for (int i = 0; i < n; i++) {
                result += str;
            }

            return result;
        }

        String word = str.substring(0, 3);

        for (int i = 0; i < n; i++) {
            result += word;
        }

        return result;
    }
}
