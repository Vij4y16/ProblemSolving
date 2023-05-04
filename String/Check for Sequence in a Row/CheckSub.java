public class CheckSub {
    public static void main(String[] args) {

        String A = "AXY";
        String B = "YADXCP";

        System.out.println(isSubsequence(A,B));
    }
    public static boolean isSubsequence(String A,String B){
        int i =0;
        int j=0;
        while (i< A.length() && j < B.length()) {
            if (A.charAt(i) == B.charAt(j)){
                i++;
            }
            j++;
        }
        return i == A.length();
    }
}
