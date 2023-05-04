import java.util.Arrays;

public class SumOfSeriesNumber {
    public static void main(String[] args) {
        int n = 46341;
        System.out.println(seriesSum(n));
    }
    public static long seriesSum(int n){
//        for (int i = 0; i <= n; i++) {
//            sum += i ;
//        }
            return (long) n * (n + 1) / 2;
    }
}
