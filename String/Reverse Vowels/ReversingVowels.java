public class ReversingVowels {
    public static void main(String[] args) {
        System.out.println(modify("practice"));
    }
    public static String modify(String S){
        int start = 0;
        int end = S.length()-1;
        char[] ch = S.toCharArray() ;
        while (start<end){


              if (!isVowel(ch[start])){
                start++;
            }
              else if (!isVowel(ch[end])) {
                  end--;
              }
              else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }

    }
        return String.valueOf(ch);

    }
    public static boolean isVowel(char ch){
        if ((ch == 'a') || (ch == 'e')||(ch == 'i') ||(ch == 'o') ||(ch == 'u') ||(ch == 'A') ||(ch == 'E') ||(ch == 'I') ||(ch == 'O') ||(ch == 'U')){
            return true;
        }
        return false;
    }
}
