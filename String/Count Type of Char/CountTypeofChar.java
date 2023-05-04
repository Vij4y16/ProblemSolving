import java.util.Arrays;

public class CountTypeofChar {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(count("#GeeKs01fOr@gEEks07")));
//  O/P 5 8 4 2
    }
    public static int[] count(String S){
        int upperCase = 0;
        int lowerCase = 0;
        int specialChar = 0;
        int numeric = 0;

        char ch ;
        for (int i = 0; i < S.length(); i++) {
            ch = S.charAt(i);

            if (ch > 64 && ch < 91){
                upperCase++;
            } else if (ch > 96 && ch < 123) {
                lowerCase++;
            } else if ((ch > 33 && ch < 48) || (ch > 57 && ch < 65) || (ch > 90 && ch < 97) || (ch > 122 && ch < 127) ){
                specialChar++;
            } else if (ch > 47 && ch < 58) {
                numeric++;
            }
        }
        int arr[] = {upperCase,lowerCase,numeric,specialChar};

        return arr ;
    }
}
