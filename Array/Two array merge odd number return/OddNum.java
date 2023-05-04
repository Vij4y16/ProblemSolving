import java.util.ArrayList;

public class OddNum {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8};
        int[] arr2 = {10,12,14,16};

        int flength = arr1.length;
        int slength = arr2.length;

        int[] mergeArray = new int[flength + slength];

//      Merge first Array.......

        for (int i = 0; i < flength; i++) {
            mergeArray [i] += arr1[i];
        }

//        Merge Second Array.........

        for (int i = 0; i < slength; i++) {
            mergeArray[i+flength] = arr2[i];
        }

//        Sorted The MergeArray.....

        for (int i = 0; i < mergeArray.length ; i++)
        {
            for(int j = i+1; j < mergeArray.length ; j++)
            {
                if(mergeArray[i] > mergeArray[j])
                {
                    int temp = mergeArray [j];
                    mergeArray [j]= mergeArray [i];
                    mergeArray [i] = temp;
                }
            }
        }

//        Store Sum Of Array....

        int[]  sumArray= new int[mergeArray.length-1] ;
        for (int i = 0; i < mergeArray.length; i++) {
            for (int j = i+1; j < mergeArray.length; j++) {
                int sum = mergeArray[i] + mergeArray[j];
                sumArray[i] = sum;
                break;
            }
        }

//        Return Odd Numbers.....

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : sumArray) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }if (result.size() > 0){
        System.out.println(result);
        }else {
            System.out.println("Odd Elements Not Found");
        }
    }
}
