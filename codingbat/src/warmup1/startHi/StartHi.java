package warmup1.startHi;

public class StartHi {

    /*
    CHALLENGE
    Given a string, return true if the string starts with "hi" and false otherwise.
     */

    public static void main(String[] args) {

        startHi("hi there"); //true
        startHi("hi"); //true
        startHi("hello hi"); //false
    }

    public static boolean startHi(String str) {

        return (str.startsWith("hi"));
    }
}
