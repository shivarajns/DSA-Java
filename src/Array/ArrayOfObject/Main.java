package Array.ArrayOfObject;

public class Main {
    public static void main(String args[]){
        System.out.println("--------- Array Of Objects ---------");

        Student[] arr = new Student[5];

        arr[0] = new Student(1, "Shivaraj");
        arr[1] = new Student(2, "Santosh");
        arr[2] = new Student(3, "Rakshita");
        arr[3] = new Student(4, "Shravya");
        arr[4] = new Student(5, "Kumar");

        System.out.println("Role Num  |    Name");
        System.out.println("----------|-------------");

        for (int i=0; i< arr.length; i++){
            System.out.println("    "+arr[i].id +"     |  "+arr[i].name);
        }
    }
}
