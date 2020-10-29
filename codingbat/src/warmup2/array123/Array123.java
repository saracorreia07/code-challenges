package warmup2.array123;

public class Array123 {

    /*
    CHALLENGE
    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
     */

    public static void main(String[] args) {

        int[] myIntArray = {1, 1, 2, 3, 1};
        int[] intArray = {1, 1, 2, 4, 1};
        int[] anotherArray = {1, 1, 2, 1, 2, 3};

        array123(myIntArray); //true
        array123(intArray); //false
        array123(anotherArray); //true
    }

    public static boolean array123(int[] nums) {

        boolean result = false;

        if(nums.length <= 2){
            return false;
        }

        for(int i = 0; i < nums.length - 1; i++) {

            if((nums[i] == 1) && (nums[i + 1] == 2) && (nums[i + 2] == 3)) {
                result = true;
            }
        }
        return result;
    }
}
