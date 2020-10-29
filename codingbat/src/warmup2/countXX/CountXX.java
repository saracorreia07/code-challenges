package warmup2.countXX;

public class CountXX {

    /*
    CHALLENGE
    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     */

    public static void main(String[] args) {

        countXX("abcxx"); //1
        countXX("xxx"); //2
        countXX("xxxx"); //3
    }

    public static int countXX(String str) {

        int occurence = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            if(str.charAt(i) == 'x' && str.charAt(i + 1) == 'x'){

                occurence++;
            }
        }
        return occurence;
    }
}
