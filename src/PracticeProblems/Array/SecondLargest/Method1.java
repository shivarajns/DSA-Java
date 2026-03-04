package PracticeProblems.Array.SecondLargest;

import java.util.Arrays;

public class Method1 {

    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 5, 8, 4};

        Arrays.sort(arr);

        int secLargest = arr[arr.length - 2];
        System.out.println("Second Largest Number is: " + secLargest);
        // Time Complexity (n log n);
    }
}
