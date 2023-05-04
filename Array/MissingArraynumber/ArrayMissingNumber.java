import java.util.Arrays;

public class ArrayMissingNumber {
    public static void main(String[] args) {

        int n =5;
        int[] array ={1,2,3,5};

        System.out.println(MissingNumber(array ,n));
    }
    public static int MissingNumber(int array[], int n){
//        Count Natural number Formula
        int RangeSum = 0;
        int arraySum = 0;

        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        for (int i = 1; i <= n; i++) {
            RangeSum += i;
        }
        return RangeSum - arraySum;
    }
}
