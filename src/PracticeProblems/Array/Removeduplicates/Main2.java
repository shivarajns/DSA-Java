package PracticeProblems.Array.Removeduplicates;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int[] nums = {1,4,2,4,2,0};

        for(int i=0; i<nums.length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }

        for(int num : set){
            System.out.print(num+" ");
        }
    }
}
