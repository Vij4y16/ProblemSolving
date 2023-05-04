public class CheckSubSeque {
    public static void main(String[] args) {
        String A = "gksrek";
        String B = "geeksforgeeks";
        System.out.println(isSubSequence(A,B));
    }
    public static boolean isSubSequence(String A, String B){
        int i=0;

        int j=0;

        while(i<A.length() && j<B.length()){

            if(A.charAt(i)==B.charAt(j)){

                i++;

                j++;

            }

            else{

                j++;

            }

        }

        return i == A.length() ? true : false;
    }
}
