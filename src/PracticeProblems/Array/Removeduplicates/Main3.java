package PracticeProblems.Array.Removeduplicates;

import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] nums = {1,2,3,2,3,2,3,1,1,4,2,4,6,8,7,6,8,5};

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
        }

        for(int num : map.keySet()){
            System.out.print(num+" ");
        }
    }
}
