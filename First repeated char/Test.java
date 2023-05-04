public class Test {
    public static void main(String[] args) {
        String S = "fabcdefafg" ;
        System.out.println(firstRep(S));
    }

    public static char firstRep(String S) {
        char ans = ' ';
        boolean repeated = false;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j < S.length(); j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    repeated = true;
                }
            }
            if (repeated) {
                ans = S.charAt(i);
                break;
            }
        }
        if (!repeated){
            return '#';
        }
        return ans;
    }
}
