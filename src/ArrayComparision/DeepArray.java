package ArrayComparision;

import java.util.Arrays;

public class DeepArray {
    public static void main(String[] args) {
        int[] inarr1 = {1, 2, 3, 4};
        int[] inarr2 = {1, 2, 3, 4};

        Object arr1[] = {inarr1};
        Object arr2[] = {inarr2};

        if(Arrays.deepEquals(arr1, arr2)){
            System.out.println("same");
        } else {
            System.out.println("Not same");
        }
    }
}
