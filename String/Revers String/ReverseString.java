public class ReverseString {
    public static void main(String[] args) {
        String S = "Vijay";
        System.out.println(Reverse(S));
    }
    public static String Reverse (String S){
        StringBuilder Result = new StringBuilder();

        for (int i = S.length()-1; i >=0 ; i--) {
            Result.append(S.charAt(i));

        }
        return Result.toString();
    }
}