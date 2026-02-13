package TwoDimensionalArrays.Initilization;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------- 2D Array ----------");

        // Initialization of 2D Array
        int [][] arr2D;

        //Declaration
        arr2D = new int[2][2];

        // Addind Values
        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[1][0] = 3;
        arr2D[1][1] = 4;

        // length of Rows
        int row = arr2D.length;

        // length of columns
        int col = arr2D[0].length;

        // Accessing Array Elements

        for(int i=0; i< row; i++){
            System.out.println();
            for(int j=0; j<col; j++){
                System.out.print(arr2D[i][j]+" ");
            }
        }

        // Initializing 2D array with Literal

        int[][] arr2Da = {
                {10,20},
                {30,40}
        };

    }
}
