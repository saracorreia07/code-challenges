package warmup2.altPairs;

public class AltPairs {

    /*
    CHALLENGE
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
    so "kittens" yields "kien".
     */

    public static void main(String[] args) {

        altPairs("kitten"); //"kien"
        altPairs("Chocolate"); //"Chole"
        altPairs("CodingHorror"); //"Congrr"
        altPairs("yak"); //"ya"
    }

    public static String altPairs(String str) {

        String result = "";

        for (int i = 0; i < str.length() - 1; i += 4) {
            result += str.substring(i, i + 2);
        }

        if((str.length() % 2 != 0)) {
            result += str.charAt(str.length() - 1);
        }

        if(str.length() == 3){
            result = str.substring(0, 2);
        }

        return result;
    }
}
