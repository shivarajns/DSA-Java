package FindingMinAndMaxInArray;

import java.util.Arrays;

public class find {

    public int Min(int[] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int minValue = arr[0];

        for(int i=0; i< arr.length; i++){
            minValue = Math.min(minValue, arr[i]);
        }

        return  minValue;
    }

    public int Max (int[] arr){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        int MaxValue = arr[0];
        for(int i=0; i<arr.length; i++){
            MaxValue = Math.max(MaxValue, arr[i]);
        }

        return MaxValue;
    }

    public void MinMax(int[] arr){
        if(arr.length == 0) return ;
        int[] result = new int[2];
        result[0] = result[1] = arr[0];

        for(int i=0; i<arr.length; i++){
            if(result[0] > arr[i]) result[0] = arr[i];
            if(result[0] < arr[i]) result[1] = arr[i];
        }
        System.out.println(Arrays.toString(result));
    }

}
