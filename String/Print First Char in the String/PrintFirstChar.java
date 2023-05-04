import java.util.Arrays;

public class PrintFirstChar {
    public static void main(String[] args) {
        String S = "geeks for geeks";
        System.out.println(firstAlphabet(S));
    }
    public static String firstAlphabet(String S){
        String ans = "";
        String[] str1 =S.split(" ");

        for (int i = 0; i < str1.length; i++) {
            ans += str1[i].charAt(0);

        }
        return ans;
    }
}
