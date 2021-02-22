package array2.countEvens;

public class CountEvens {

    /*
    CHALLENGE
    Return the number of even ints in the given array.
    Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
    */

    public static void main(String[] args) {

        int[] myArray = {2, 1, 2, 3, 4};
        int[] intArray = {2, 2, 0};
        int[] anotherArray = {1, 3, 5};

        countEvens(myArray); //3
        countEvens(intArray); //3
        countEvens(anotherArray); //0

    }

    public static int countEvens(int[] nums) {

        int count = 0;

        for(int i : nums) {
            if(i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
