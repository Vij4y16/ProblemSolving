public class Ceiling {
    public static void main(String[] args) {

        int[] arr={2,3,4,9,14,16,18};
        int target = 15;

        int ans = ceiling(arr,target);
        System.out.println(ans);
    }

    static int ceiling (int[] arr , int tareget){

        if (tareget > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while (start<=end){

            int mid = start + (end-start) / 2;

            if (tareget < arr[mid]){
                end = mid - 1;
            } else if (tareget > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
