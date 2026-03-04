package PracticeProblems.Array.SecondLargest;

public class Method2 {
    public static void main(String[] args) {
        int largest = 0;
        int secLargest = 0;

        int[] arr = {1, 7, 3, 5, 8, 4};

        for(int num : arr) {
            if(num > largest){
                largest = num;
            }
        }

        for(int num : arr){
            if(num < largest && num > secLargest){
                secLargest = num;
            }
        }
        System.out.println("Second Largest Number is: "+secLargest);

        // Time Complexity is O(n);


    }
}
