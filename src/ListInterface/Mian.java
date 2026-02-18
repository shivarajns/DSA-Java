package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mian {

    public static void main(String[] args) {

        System.out.println("---------------- List Interface ----------------");

        List<String> li = new ArrayList<>();

        li.add("Shivaraj");
        li.add("Santosh");

        System.out.println("The Elements of List are:- "+li);

        String frsEle = li.get(0);
        String secEle = li.get(1);

        System.out.println("The first Element of the List is: " + frsEle);
        System.out.println("The Second Element of the List is: " + secEle);

        li.remove(0);
        System.out.println("List after Remove 1st Element: " + li);

        li.add(0,"santosh");
        Collections.addAll(li, "Pavan", "Jaga", "Manju");


        // Transverse of all Elements in the List
        for (String a : li){
            System.out.print(a+" ");
        }
    }
}
