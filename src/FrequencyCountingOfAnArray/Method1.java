package FrequencyCountingOfAnArray;

import java.util.HashMap;

public class Method1 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,5,3,7,9,5,6,4,6,7,5,3,5,6,4,7,9,8,1,4,0};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        System.out.println(map);

    }
}
