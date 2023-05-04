import java.util.Arrays;

public class CharArraytoString {
    public static void main(String[] args) {
        char[] arr = {'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e','e', 'k', 's'};
        int n = 13;
        System.out.println(chartostr(arr , n));
    }
    public static String chartostr(char[] arr, int N){

        String str = new String(arr);
//        String str = String.copyValueOf(arr);
//        for (char c : arr) {
//            result += c;
//        }
//        return result;
        return str;
    }
}
