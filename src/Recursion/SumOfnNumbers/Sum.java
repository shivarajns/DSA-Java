package Recursion.SumOfnNumbers;

public class Sum {

    public int SumOfNums(int n){
        if(n==1 ){
            return 1;
        }

        return n + SumOfNums(n - 1);
    }
}
