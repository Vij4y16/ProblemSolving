public class CamelCase {
    public static void main(String[] args) {

        System.out.println(countCamelCase("abcd"));
    }
    public  static int countCamelCase(String S){
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (ch >= 'A' && ch <= 'Z'){
                count++;
            }
        }return count;
    }
}
