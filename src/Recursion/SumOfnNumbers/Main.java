package Recursion.SumOfnNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Sum sum = new Sum();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        System.out.println("The Sum of " + n +"Number is : "+ sum.SumOfNums(n));
    }
}
