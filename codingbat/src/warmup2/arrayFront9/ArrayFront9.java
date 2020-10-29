package warmup2.arrayFront9;

public class ArrayFront9 {

    /*
    CHALLENGE
    Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length may be less than 4.
     */

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 9, 3, 4};
        int[] intArray = {1, 2, 3, 4, 9};
        int[] anotherArray = {1, 2, 3, 4, 5};

        arrayFront9(myIntArray); //true
        arrayFront9(intArray); //false
        arrayFront9(anotherArray); //false
    }

    public static boolean arrayFront9(int[] nums) {

        boolean nine = false;

        for(int i = 0; i < nums.length; i++) {

            if((i <= 3) && (nums[i] == 9)){

                nine = true;
            }
        }
        return nine;
    }
}
