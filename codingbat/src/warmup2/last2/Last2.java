package warmup2.last2;

public class Last2 {

    /*
    CHALLENGE
    Given a string, return the count of the number of times that a substring length 2 appears in the string
    and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
     */

    public static void main(String[] args) {

        last2("hixxhi"); //1
        last2("xaxxaxaxx"); //1
        last2("axxxaaxx"); //2
    }

    public static int last2(String str) {

        if(str.length() <= 2) {
            return 0;
        }

        String target = str.substring(str.length() - 2);
        int count = 0;

        for(int i = 0; i < str.length() - 2; i++) {

            if ((str.charAt(i) == target.charAt(0)) && (str.charAt(i + 1) == target.charAt(1))) {
                count++;
            }
        }
        return count;
    }
}
