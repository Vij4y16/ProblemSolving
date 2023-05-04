public class LargestIndex {
    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,9,8,4,};
        System.out.println(FindLargestIndex(arr));
    }

    static int FindLargestIndex(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start < end){

            int mid = start+(end-start)/2;

            if (arr[mid] > arr[mid+1]){
                // you are in dec part of array
                // this may be the ans,but check left side
                // this is why end != mid - 1
                end = mid;
            }else {

                // you are in asc part of array
                start = mid+1; // because we know that mid+1 element > mid element
            }
            // in the end , start == end pointing to the largest number because of the 2 checks above
        }
        return start;
    }
}
