package FrequencyCountingOfAnArray;

import java.util.HashMap;

public class FindCharacterFrequency {

    public static void main(String[] args) {

        String s = "shivarajuns";
        HashMap <Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        System.out.println(map);
        System.out.println(map.values());
    }
}
