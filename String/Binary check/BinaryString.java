public class BinaryString {
    public static void main(String[] args) {
        String str = "112";
        System.out.println(isBinary(str));
    }
    public  static boolean isBinary(String str) {
//         char ch;
//         for(int i = 0; i<length; i++){
//             ch = str.charAt(i);
//             if(ch != '1' && ch != '0'){
//                 return false;
//             }
//         }
//     return true;
//     }

        boolean flag = true;
        int length = str.length();
         char ch;
         for(int i = 0; i<length; i++){
             ch = str.charAt(i);
             if(ch == '1' || ch == '0'){
                 flag = true;
             }else {
                 flag = false;
                 break;
             }
         }
     return flag;
     }
}
