public class SameIndexCount {
    public static void main(String[] args) {

        String s = "abcab";
        int c=0;
        for(int i=0;i<s.length();i++) {
            for(int j=i;j<s.length();j++) {
                if(s.charAt(i)==s.charAt(j))
                    c++;
            }
        }
        System.out.println(c);
    }
}
