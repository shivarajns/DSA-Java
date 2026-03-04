package ArrayComparision;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Same");
        }
        else{
            System.out.println("Different");
        }
    }
}
