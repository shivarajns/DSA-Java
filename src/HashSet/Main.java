package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------------ HashSet ------------------");

        // Declaration
        Set <Integer> nums = new HashSet<>();

        // Adding Values to the HashSet
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        System.out.println("The Elements of HashSet: "+nums);

        // Remove values from HashSet
        nums.remove(3);
        System.out.println(nums);

        // Iterating Through the HashSet

        Iterator<Integer> iterator = nums.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        // Iterating using Enhance loop
        for (Integer e : nums){
            System.out.print(e+" ");
        }
    }
}
