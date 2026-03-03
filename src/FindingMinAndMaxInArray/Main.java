package FindingMinAndMaxInArray;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 40, 28, 67, 104};

        find find = new find();
        System.out.println("Minimum value is: " + find.Min(arr));
        System.out.println("Maximum value is: "+find.Max(arr));
        find.MinMax(arr);
    }
}
