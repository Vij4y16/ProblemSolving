public class SubarraySum {
    public static void main(String[] args) {
        int n =5;
        int s = 12;
        int[] a = {1,2,3,7,5};

        System.out.println(subarraySum(n,s,a));
    }
    public static int subarraySum(int n, int s, int[] a){

        int sum = 0;
        for (int i = 0; i < a.length;) {
            sum += a[i];
            if (sum == s);
            {
                return sum;
                break;
            }
            ;
        }
    }
}
