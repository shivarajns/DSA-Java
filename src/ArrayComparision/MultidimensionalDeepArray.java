package ArrayComparision;

import java.util.Arrays;

public class MultidimensionalDeepArray {

    public static void main(String[] args) {
        int[] inarr1 = {1, 2, 3, 4};
        int[] inarr2 = {1, 2, 3, 4};

        Object arr1[] = {inarr1};
        Object arr2[] = {inarr2};

        Object outarr1[] = {arr1};
        Object outarr2[] = {arr2};

        if(Arrays.deepEquals(outarr1, outarr2)){
            System.out.println("Same");
        } else{
            System.out.println("Not Same");
        }
    }
}
