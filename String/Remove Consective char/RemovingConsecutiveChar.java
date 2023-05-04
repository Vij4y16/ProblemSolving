public class RemovingConsecutiveChar {
    public static void main(String[] args) {
        String S = "aabbabbac";
        System.out.println(removeConsecutiveCharacter(S));
    }
//    }
    public static String removeConsecutiveCharacter (String S){
        String ans = "";
        for (int i = 0; i < S.length()-1; i++) {
            if (S.charAt(i) != S.charAt(i+1)){
                ans += S.charAt(i);
            }
        }
        ans += S.charAt(S.length()-1);
        return ans;
    }
}
