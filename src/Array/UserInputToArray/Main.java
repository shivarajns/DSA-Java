package Array.UserInputToArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------- Sum of N Array -------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Length of the Array: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Enter the "+ (i+1) + " Element of the Array: ");
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println();
        System.out.println("Sum of the given Array is: " + Sum.Sum(arr));

    }
}
