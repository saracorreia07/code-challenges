package warmup1.mixStart;

public class MixStart {

    /*
    CHALLENGE
    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
     */

    public static void main(String[] args) {

        mixStart("mix snacks"); //true
        mixStart("pix snacks"); //true
        mixStart("piz snacks"); //false
    }

    public static boolean mixStart(String str) {

        if(str.length() > 2){

            String target = str.substring(1, 3);

            return (target.equals("ix"));
        }
        return false;
    }
}
