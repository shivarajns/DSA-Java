package PracticeProblems.Array.Removeduplicates;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,2,3,3,3,4,5,6,6,6};

        int j = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }

        for(int i=0; i<j; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
