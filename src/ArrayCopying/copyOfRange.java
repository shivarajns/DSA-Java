package ArrayCopying;

import java.util.Arrays;

public class copyOfRange {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = Arrays.copyOfRange(a,0,5);

        System.out.println(Arrays.toString(b));

        //Copy from 2nd Element to Last 4th element
        int[] c = Arrays.copyOfRange(a,2,4);
        System.out.println(Arrays.toString(c));
    }
}
