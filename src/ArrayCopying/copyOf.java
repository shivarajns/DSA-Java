package ArrayCopying;

import java.util.Arrays;

public class copyOf {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = Arrays.copyOf(a,5);

        System.out.println(Arrays.toString(b));

        // Copy only 3 elements
        int[] c = Arrays.copyOf(a,3);
        System.out.println(Arrays.toString(c));


    }
}
