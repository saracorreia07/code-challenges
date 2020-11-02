package string1.helloName;

public class HelloName {

    /*
    CHALLENGE
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     */

    public static void main(String[] args) {

        helloName("Bob"); //"Hello Bob!"
        helloName("Alice"); //"Hello Alice!"
        helloName("X"); //"Hello X!"
    }

    public static String helloName(String name) {

        return "Hello " + name + "!";
    }
}
