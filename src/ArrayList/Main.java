package ArrayList;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main (String[] args){

        System.out.println("----------- Array List -----------");

        // Declaration and Initalization of ArrayList
        ArrayList<Integer> nums = new ArrayList<>();

        // Adding Elements to the ArrayList
        nums.add(10);
        nums.add(20);

        // Adding Multiple Elements to the Array
        Collections.addAll(nums, 30, 40, 50, 60, 65, 70, 75, 80, 90, 100);

        System.out.println(nums);

        // Remove Elements by Index
        nums.remove(6);
        System.out.println(nums);

        // Set a new element value
        nums.set(7,120);
        System.out.println(nums);
    }
}
