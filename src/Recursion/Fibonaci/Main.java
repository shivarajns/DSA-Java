package Recursion.Fibonaci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Value of N: ");

        int n = scanner.nextInt();

        Fibonaci fibo = new Fibonaci();

        for (int i=0; i<=n; i++){
            System.out.print(fibo.fn(i));
        }
    }
}
