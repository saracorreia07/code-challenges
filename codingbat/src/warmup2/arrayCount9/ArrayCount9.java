package warmup2.arrayCount9;

public class ArrayCount9 {

    /*
    CHALLENGE
    Given an array of ints, return the number of 9's in the array.
     */

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 9};
        int[] intArray = {1, 9, 9};
        int[] anotherArray = {1, 9, 9, 3, 9};

        arrayCount9(myIntArray); //1
        arrayCount9(intArray); //2
        arrayCount9(anotherArray); //3
    }

    public static int arrayCount9(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 9){
                count++;
            }
        }
        return count;
    }
}
