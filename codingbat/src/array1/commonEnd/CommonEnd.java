package array1.commonEnd;

public class CommonEnd {

    /*
    CHALLENGE
    Given 2 arrays of ints, a and b,
    return true if they have the same first element or they have the same last element.
    Both arrays will be length 1 or more.
     */

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 3};

        int[] myArr = {1, 2, 3};
        int[] myArr2 = {7, 3, 2};

        int[] anotherArr1 = {1, 2, 3};
        int[] anotherArr2 = {1, 3};

        commonEnd(arr1, arr2); //true
        commonEnd(myArr, myArr2); //false
        commonEnd(anotherArr1, anotherArr2); //true
    }

    public static boolean commonEnd(int[] a, int[] b) {

        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }
}
