package SwappingElementsOfArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        System.out.println("Array before Swap");
        System.out.println(Arrays.toString(arr));

        int a = 0;
        int b = 1;


        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println("Array after Swap");
        System.out.println(Arrays.toString(arr));


        int[] arr2 = {100, 200, 300, 400};
        System.out.println("Array before Swap");
        new Swap(arr2, 0, 1);
        System.out.println(Arrays.toString(arr2));
        System.out.println("Array after Swap");
    }
}
