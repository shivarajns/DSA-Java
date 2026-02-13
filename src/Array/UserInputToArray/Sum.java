package Array.UserInputToArray;

public class Sum {

    public static int Sum(int[] arr){
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
}
