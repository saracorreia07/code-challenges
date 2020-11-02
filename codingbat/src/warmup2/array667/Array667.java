package warmup2.array667;

public class Array667 {

    /*
    CHALLENGE
    Given an array of ints, return the number of times that two 6's are next to each other in the array.
    Also count instances where the second "6" is actually a 7.
     */

    public static void main(String[] args) {

        int[] myIntArray = {6, 6, 2};
        int[] intArray = {6, 6, 2, 6};
        int[] anotherArray = {6, 7, 2, 6};

        array667(myIntArray); //1
        array667(intArray); //1
        array667(anotherArray); //1
    }

    public static int array667(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length - 1; i++){

            if(nums[i] == 6 && nums[i + 1] == 6 || nums[i + 1] == 7){
                count++;
            }
        }
        return count++;
    }
}
