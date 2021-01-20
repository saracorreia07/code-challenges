package array1.firstLast6;

public class FirstLast6 {

    /*
    CHALLENGE
    Given an array of ints, return true if 6 appears as either the first or last element in the array.
    The array will be length 1 or more.
     */

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 6};
        int[] intArray = {6, 1, 2, 3};
        int[] anotherArray = {13, 6, 1, 2, 3};

        firstLast6(myIntArray); //true
        //firstLast6(intArray); //true
        //firstLast6(anotherArray); //false
    }

    public static boolean firstLast6(int[] nums) {

        boolean result = false;

        if (nums.length >= 1) {

            if (nums[0] == 6 || nums[nums.length - 1] == 6) {
                result = true;
            }
        }

        return result;
    }
}
