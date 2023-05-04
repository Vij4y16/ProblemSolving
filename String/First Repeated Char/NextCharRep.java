public class NextCharRep {
    public static void main(String[] args) {
        System.out.println(nextchar("geeksforgeeks"));
    }

    public static String nextchar(String s){
        char ch = 0;
        char nextch = 0;
        for (int i = 0; i < s.length()-1; i++) {
            ch = s.charAt(i);
            nextch = s.charAt(i+1);

            if (ch==nextch){
                String ans = " " + ch;
                return ans;
            }
        }
        return "-1";
    }
}
