public class Longest {
    public static void main(String[] args) {
        int N = 5;
        String names[] = {"geek","geeks","geeksfor","geeksforgeek","geeksforgeeks"};
        System.out.println(longest(N,names));
    }


    private  static String longest(int N,String names[]){
        String longest = names[0];

        for (int i = 0; i < N; i++){
            if (longest.length() < names[i].length()){
                longest = names[i];
            }
        }
        return longest;
    }
}