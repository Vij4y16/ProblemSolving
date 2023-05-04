public class RemoveDuplicateChar {
    public static void main(String[] args) {

        String s = "geeksforgeeks";
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            for (j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) //same character found
                {
                    break;
                }
            }
            if (i == j) {
                ans += s.charAt(i);
            }
        }
    }
}
