public class ConcReverse {
    public static void main(String[] args) {

        System.out.println(conRevstr("Geeks","forGeeks"));
    }
    public static String conRevstr(String s1 , String s2){
        String Concatenate = s1+s2;
        String Reverse = "";

        for (int i = Concatenate.length() -1; i >=0 ; i--) {
            Reverse += Concatenate.charAt(i);
        }
        return Reverse;
    }
}
