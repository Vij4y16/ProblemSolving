import java.util.Stack;

public class StringRotate {
    public static void main(String[] args) {
        String s1 = "cevug";
        String s2 = "vuce";
        System.out.println(areRotations(s1,s2));
    }
    public static boolean areRotations(String s1,String s2){

//        Check if s1 and s2 length is same or not.......

        if (s1.length() != s2.length()) {
            return false;
        }
//        Add two s1 string.......

        String s3 = s1+s1;
//        Using two pointer Algorithm s2 is Occur in the s3 String.....
        int i= 0;
        int j= 0;

        while (i<s2.length() && j < s3.length()){
            if (s2.charAt(i) == s3.charAt(j)){
                i++;
            }
            j++;
        }
//        i length is == s2 String length,
//        s2 string is Occur in the s3 string, So the String is rotate.....
        return i == s2.length();

    }
}
