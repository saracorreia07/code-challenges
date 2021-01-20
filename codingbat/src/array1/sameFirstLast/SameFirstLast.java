package array1.sameFirstLast;

public class SameFirstLast {

    /*
    CHALLENGE
    Given an array of ints, return true if the array is length 1 or more,
    and the first element and the last element are equal.
     */

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3};
        int[] intArray = {1, 2, 3, 1};
        int[] anotherArray = {1, 2, 1};

        sameFirstLast(myIntArray); //false
        //sameFirstLast(intArray); //true
        //sameFirstLast(anotherArray); //true
    }

    public static boolean sameFirstLast(int[] nums) {

        boolean result = false;

        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            result = true;
        }

        return result;
    }
}
