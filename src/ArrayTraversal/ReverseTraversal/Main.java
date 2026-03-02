package ArrayTraversal.ReverseTraversal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Reverse Traversal");

        int arr[] = {1,5,3,8,0,3,6,8};

        int n = arr.length;

        for(int i = n-1 ; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
