package TwoDimensionalArrays.UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------- User Input for an 2D Array -------------");

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the size of Rows: ");
        int row = scnr.nextInt();
        scnr.nextLine();

        System.out.print("Enter the size of Columns: ");
        int col = scnr.nextInt();
        scnr.nextLine();

        int[][] nums = new int[row][col];

        for(int i=0; i<row; i++){

            for(int j=0; j<col; j++){
                System.out.print("Enter the Value for "+ " Row "+ i+1 +" Column " + j+1 +" : ");
                nums[i][j] = scnr.nextInt();
                scnr.nextLine();
            }
        }

        for (int i=0; i<row; i++){
            System.out.println();
            for(int j=0; j<col; j++){
                System.out.print(nums[i][j]+" ");
            }
        }
    }
}
