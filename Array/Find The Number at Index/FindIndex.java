
public class FindIndex {
    public static void main(String[] args) {
       int n = 5;
       int[] arr = {1, 2, 3, 5};
       int k = 4;
        System.out.println(binary(arr,n,k));
    }
    public static int binary(int[] arr,int n, int k){
//        for (int i = 0; i < arr.length; i++) {
//            if (k== arr[i]){
//                return i;
//            }
//        }

        int start = 0;
        int end = arr.length-1;

        while (start <= end){


//          (start +end)/2

            int mid = start +(end -start)/2;

            if (k < arr[mid]){
                end = mid -1;
            }else if(k > arr[mid]){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
