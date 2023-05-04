public class RemoveoddIndex {
    public static void main(String[] args) {
        System.out.println(delAlternate("Geeks"));
    }
    public static String delAlternate(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i%2==0){
                result += s.charAt(i);
            }
        }
        return result;
    }
}

