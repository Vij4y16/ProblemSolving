import java.util.Arrays;

public class BinaryCount {
    public static void main(String[] args) {
        int n = 4;
        String str = "1111";
        System.out.println(binarySubstring(n,str));
    }
    public static int binarySubstring(int a, String str){
//        int count = 0;
//
//        for (int i = 0; i <str.length() ; i++) {
//            for (int j = i+1; j <str.length() ; j++) {
//                if (str.charAt(i) == '1' && str.charAt(j)=='1'){
//                    count++;
//                }
//            }
//        }
//        return count;


        int count = 0;

        for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i) == '1'){
                    count++;
                }
        }
        return count*(count-1)/2;

    }
}
