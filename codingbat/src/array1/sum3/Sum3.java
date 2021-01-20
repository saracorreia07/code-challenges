package array1.sum3;

public class Sum3 {

    /*
    CHALLENGE
    Given an array of ints length 3, return the sum of all the elements.
     */

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3};
        int[] intArray = {5, 11, 2};
        int[] anotherArray = {7, 0, 0};

        sum3(myArray); //6
        sum3(intArray); //18
        sum3(anotherArray); //7
    }

    public static int sum3(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }

        return result;
    }
}
