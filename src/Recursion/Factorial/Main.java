package Recursion.Factorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Value of N: ");
        int n = scanner.nextInt();

        Factorial fact = new Factorial();

        System.out.println("The Factorial of a given number "+ n + " is : " + fact.factorial(n));


    }

}
