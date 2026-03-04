package ArrayCopying;

import java.util.Arrays;

public class arrayCopy {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];

        System.arraycopy(a,0,b,0,5);

        System.out.println(Arrays.toString(b));
    }
}
