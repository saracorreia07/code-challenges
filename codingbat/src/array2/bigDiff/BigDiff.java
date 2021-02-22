package array2.bigDiff;

public class BigDiff {

    /*
    CHALLENGE
    Given an array length 1 or more of ints,
    return the difference between the largest and smallest values in the array.
    Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
     */

    public static void main(String[] args) {

        int[] myArray = {10, 3, 5, 6};
        int[] intArray = {7, 2, 10, 9};
        int[] anotherArray = {2, 10, 7, 2};

        bigDiff(myArray); //7
        //bigDiff(intArray); //8
        //bigDiff(anotherArray); //8
    }

    public static  int bigDiff(int[] nums){

        int smallest = 0;
        int largest;

        for(int i = 0; i < nums.length - 1; i++) {

            smallest = Math.min(nums[i], nums[i + 1]);

            if (smallest > Math.min(nums[i], nums[i + 1])) {
                smallest = Math.min(nums[i], nums[i + 1]);
            }
            //System.out.println(nums[i]);
        }
        System.out.println(smallest);
        return 1;
    }
}
