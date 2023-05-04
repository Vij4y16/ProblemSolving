public class RemoveCommon {
    public static void main(String[] args) {

        String s1 = "gee", s2 = "gee";
        System.out.println(concatenatedString(s1,s2));

    }
    public static String concatenatedString(String s1,String s2){
        String s1copy = s1, s2copy = s2;
        for (int i = 0; i <s1.length(); i++) {
            for (int j = 0; j <s2.length() ; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    String temp = String.valueOf(s1.charAt(i));
                    s1copy = s1copy.replace(temp, "");
                    break;
                }
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s2.charAt(i) == s1.charAt(j)){
                    String temp = String.valueOf(s2.charAt(i));
                    s2copy = s2copy.replace(temp,"");
                }
            }
        }
        String ans = s1copy+s2copy;
        if (ans.equals("")){
            return "-1";
        }
        return ans;
    }
}
