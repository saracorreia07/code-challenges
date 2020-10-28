package warmup1.delDel;

public class DelDel {

    /*
    CHALLENGE
    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
    Otherwise, return the string unchanged.
     */

    public static void main(String[] args) {

        delDel("adelbc"); //"abc"
        delDel("adelHello"); //"aHello"
        delDel("adedbc"); //"adedbc"
    }

    public static String delDel(String str) {

        if(str.length() > 3) {

            String target = str.substring(1, 4);

            if(target.equals("del")){
                return str.charAt(0) + str.substring(target.length() + 1, str.length());
            }
        }
        return str;
    }
}
