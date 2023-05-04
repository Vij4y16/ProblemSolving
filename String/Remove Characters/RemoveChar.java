public class RemoveChar {
    public static void main(String[] args) {
        String string1 = "occurrence" , string2 = "car";
        System.out.println(removeChars(string1,string2));
    }

    public static String removeChars(String string1, String string2){
        String output = "";
        boolean flag = false;

        for (int i = 0; i < string1.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {

                if (string1.charAt(i) == string2.charAt(j)){
                    flag = true;
                    break;
                }else {
                    flag = false;
                }
            }
            if (!flag) {
                output += string1.charAt(i);
            }
        }

        return output;
    }
}
