package String.StringMethods;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------- String Methods --------");

        String name = "Shivaraj";

        System.out.println("Length of the name is:- "+name.length());

        System.out.println("is start with S ? :- " + (name.startsWith("S")? "yes" : "no"));

        System.out.println("Character at 4th index is:- " + name.charAt(4));

        // substring
        System.out.println("Nick name:- " + name.substring(0, 5));

        // Append
        System.out.println("Add @gmail to end:- " + name.concat("@gmail.com"));

        // To Find the Index of a Specific Character
        System.out.println("Index of v is:- "+ name.indexOf("v"));

        // Equals method
        System.out.println("is it Equals to Shivaraj ? :- " + (name.equals("Shivaraj") ? "yes" : "no"));

        // compares to
        System.out.println("What is the Difference between Shivaraj and Shiva ? :- " + name.compareTo("Shiva"));

        // Lower the Cases
        System.out.println(name.toLowerCase());

        // Upper the case
        System.out.println(name.toUpperCase());

        // Trim method (It will trim the Spaces before and after the string Not in the middle of the string)
        String name2 = "                    shivaraj N S      ";
        name2 = name2.trim();
        System.out.println(name2);

        // Replace method
        System.out.println(name.replace("S", "s"));

        // Contains
        System.out.println(name.contains("S") ? "Yes":"No");

        // toCharArray Method -> Which converts String into Array of Characters
        char[] name3 = name.toCharArray();

        for(char Characters : name3){
            System.out.print(Characters+ " ");
        }

    }
}
