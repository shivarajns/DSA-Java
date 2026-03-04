package ArrayCopying;

import ArrayComparision.Array;

import java.util.Arrays;

public class ArrayClone {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();

        int[][] c = {{1,2,3}, {4,5,6}};
        int[][] d = c.clone();

        System.out.println("a:-"+Arrays.toString(a));
        System.out.println("b:-"+Arrays.toString(b));

    }
}
