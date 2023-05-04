import java.util.Arrays;

public class RemoveRepeatedReverse {
    public static void main(String[] args) {
        String s = "C A  DE DGDG";

        System.out.println(reverseString(s));
    }
    public static String reverseString(String s) {

        String reverse = "";
        String ans = "";

        String[] word = s.split(" ");
        String oneChar = "";

//        Swap the array (or) Reverse the array....
        int left = 0;
        int right = word.length-1;
        while (left < right){
            String temp = word[left];
            word[left] = word[right];
            word[right] =temp;
            left++;
            right--;
        }

//        Reverse the String one by one inside the array.....

        for (int i = 0; i < word.length; i++) {
            int length = word[i].length();
            String temp = word[i];

//            if the String length is 1 not reversing ...
            if (length == 1) {
                 oneChar += temp;
            } else{
                for (int j = temp.length() - 1; j >= 0; j--) {
                    reverse += temp.charAt(j);
                }
            }
        }

//        add the 1 length character in last index.....
        reverse += oneChar;


//        Remove The duplicate Characters.....

        for (int i = 0; i < reverse.length(); i++) {
            int j;
            for (j = 0; j < reverse.length(); j++) {
                if (reverse.charAt(i) == reverse.charAt(j)) {
                    break;
                }
            }
            if (i == j) {
                ans += reverse.charAt(i);
            }
        }
        return ans;
    }
}
