import java.util.Arrays;

public class UncommonChar {
    public static void main(String[] args) {
        String A = "characters" , B = "alphabets";
        System.out.println(UncommonChars(A,B));
    }
    public static String UncommonChars(String A,String B) {
//        copyA is using remove the common char
        String copyA = A;
//        copyA is using remove the common char
        String copyB = B;

        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    String temp = "" + A.charAt(i);
                    copyA = copyA.replace(temp, "");
                    break;
                }
            }
        }
        for (int i = 0; i < B.length(); i++) {
            for (int j = 0; j < A.length(); j++) {
                if (B.charAt(i) == A.charAt(j)) {
                    String temp = "" + B.charAt(i);
                    copyB = copyB.replace(temp, "");
                    break;
                }
            }
        }
//         concat two String
        String tempstring = copyA + copyB;
//      Stored to array to use sort the char alphabetical order

        char[] temparray = tempstring.toCharArray();
        Arrays.sort(temparray);
        String str = new String(temparray);

        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            boolean repeated = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                temp += str.charAt(i);
            }
        }
        if (temp.equals("")){
            return "-1";
        }
        return temp;
    }
}

