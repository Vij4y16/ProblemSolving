public class Firstrepetedchar {

    public static void main(String[] args) {
        System.out.println(firstRepChar("hellogeeks"));
    }
    public static String firstRepChar(String s){

        String ans ;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = i+1 ; j < s.length()-1; j++) {

//                System.out.println(s.charAt(j));

                if (ch == s.charAt(j)){
                    ans = String.valueOf(s.charAt(i));

                    return ans;

                }
            }
        }
        return " -1 ";
    }
}