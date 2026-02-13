package Array.PassingArraysToMethods;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------- Sum of the array ---------");

        int[] arr = {1,2,3,4};
        int sum = Sum.sum(arr);

        System.out.println(sum);
    }
}
