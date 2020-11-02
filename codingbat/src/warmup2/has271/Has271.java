package warmup2.has271;

public class Has271 {

    /*
    CHALLENGE
    Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
    followed by the value minus 1.
    Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
     */

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 7, 1};
        int[] intArray = {1, 2, 8, 1};
        int[] anotherArray = {4, 5, 3, 8, 0};

        //has271(myIntArray); //true
        //has271(intArray); //false
        has271(anotherArray); //true
    }

    public static boolean has271(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++){

            int x = nums[i + 2];

            if((nums[i] == 2) && (nums[i + 1] == 7) && (x >= 1 - 2 && x <= 1 + 2)){
                return true;
            }

            if((nums[i + 1] - 5 == nums[i]) && (nums[i] - x >= 1 - 2 && nums[i] - x <= 1 + 2)){
                return true;
            }
        }
        return false;
    }
}
