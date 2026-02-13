package Array.Operations;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Operations on Array--------------");

        //Accessing the Elements of the Array
        int[] nums = {1,2,3,4,5};

        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }

        System.out.println();

        //To Find the length of the Array
        int length = nums.length;
        System.out.println("The length of the Array is: "+length);

        // Update the Array Elements

        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
        System.out.println();
        System.out.println("The updated Array is");
        for (int num: nums){
            System.out.print(num+" ");
        }
    }
}
