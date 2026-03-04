package PracticeProblems.Array.SecondLargest;

public class Method3 {
    public static void main(String[] args) {
        int[] arr = {1, 18, 3, 5, 8, 4};

        int lar = 0;
        int secLar = 0;

        for(int num : arr){
            if(num > lar){
                secLar = lar;
                lar = num;
            } else if (num > secLar && num != lar) {
                secLar = num;
            }
        }

        System.out.println("The Second Largest Number is: "+secLar);
    }
}
