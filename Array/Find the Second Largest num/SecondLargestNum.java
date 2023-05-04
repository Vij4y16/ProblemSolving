public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10};
        int n = 3;

        System.out.println(secondLargestNumber(arr,n));
    }

    public static int secondLargestNumber(int[] arr, int n) {
        int max1 = arr[0];
        int max2 = 0;

        // find the first largest number
        for (int i = 0; i < n; i++) {
            if (max1 < arr[i]) {
                max1 = arr[i];
            }
        }

        // find the second-largest number
        for (int i = 0; i < n; i++) {
            // if max2 grater then arr[i] and
            // arr[i] is not equal to my first largest number
            if (max2 < arr[i] && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        // not found the second-largest number should return -1
        // otherwise return max2.
        if (max2 == 0) {
            return -1;
        }
        return max2;
    }

}
