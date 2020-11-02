package warmup2.noTriples;

public class NoTriples {

    /*
    CHALLENGE
    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
    Return true if the array does not contain any triples.
     */

    public static void main(String[] args) {

        int[] myIntArray = {1, 1, 2, 2, 1};
        int[] intArray = {1, 1, 2, 2, 2, 1};
        int[] anotherArray = {1, 1, 1, 2, 2, 2, 1};

        noTriples(myIntArray); //true
        noTriples(intArray); //false
        noTriples(anotherArray); //false
    }

    public static boolean noTriples(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {

            int x = nums[i];

            if(nums[i + 1] == x && nums[i + 2] == x) {
               return false;
            }
        }
        return true;
    }
}
