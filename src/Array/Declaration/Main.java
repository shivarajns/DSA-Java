package Array.Declaration;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------Array Declaration---------");

        //Array Declaration
        int [] nums;

        //Array Initialization
        int [] nums_1 = new int[5];

        //Array Literals
        int [] nums_2 = {1,2,3,4,5};


        //Accessing the Elements in the Array -- nums_1 Elements
        for (int i = 0; i<nums_1.length; i++){
            System.out.print(nums_1[i]+" ");
        }

        System.out.println();

        //Accessing the Elements of nums_2 Array
        for (int numss : nums_2){
            System.out.print(numss+" ");
        }

    }
}
