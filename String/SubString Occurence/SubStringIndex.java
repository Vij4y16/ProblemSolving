//Your task is to implement the function SubString.
// The function takes two strings as arguments (s,x) and
// locates the occurrence of the string x in the string s.
// The function returns and integer denoting the
// first occurrence of the string x in s (0 based indexing).
//
//        Note: You are not allowed to use inbuilt function.
//
//        Example 1:
//        Input:
//        s = GeeksForGeeks, x = Fr
//        Output: -1
//        Explanation: (Fr) is not present in the
//        string GeeksForGeeks as substring.
//
//        Example 2:
//        Input:
//        s = GeeksForGeeks, x = For
//        Output: 5
//        Explanation: For is present as substring
//        in GeeksForGeeks from index 5 (0 based
//        indexing).


public class SubStringIndex {
    public static void main(String[] args) {
        String s = "ababaaaaaa";
        String sub = "abaa";

        System.out.println(SubStringSearch(s,sub));
    }

    public static int SubStringSearch(String s, String sub){
        int count = 0;
        int firstOccurrenceIndex = 0;
        int ii ;
        for (int i=0; i< s.length() - sub.length()+1;i++){
            count = 0;
            if(s.charAt(i) == sub.charAt(0)) {
                ii = i;
                firstOccurrenceIndex = i;

                for (int j=0 ; j<sub.length();j++) {
                    if(s.charAt(ii) == sub.charAt(j)) count++;
                    ii = ii+1;
                }
                if (count == sub.length()) break;
            }
        }
        if (count == sub.length()){
            return firstOccurrenceIndex;
        }else {
            return -1;
        }
    }

}
