package HashMap;

import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main (String[ ] args){
        System.out.println("----------- HashMap -----------");

        HashMap <String, Integer> names = new HashMap<>();

        names.put("Shivaraj", 1);
        names.put("Santosh", 2);
        names.put("Pavan", 3);


        for (Map.Entry<String, Integer> e : names.entrySet()) {
            System.out.println(e.getValue()+": "+e.getKey());
        }

        names.put("Pavan", 10);

        System.out.println("After Updating ");

        for (Map.Entry<String, Integer> e : names.entrySet()) {
            System.out.println(e.getValue()+": "+e.getKey());
        }

        names.remove("Pavan");

        System.out.println("After Removing Pavan ");

        for (Map.Entry<String, Integer> e : names.entrySet()) {
            System.out.println(e.getValue()+": "+e.getKey());
        }

    }
}
