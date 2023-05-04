public class StringAnagram {
    public static void main(String[] args) {
        String s = "basgadhbfgvhads";
        String s1 = "sjdhgvbjdsbhvbvd";

        System.out.println(remAnagrams(s,s1));
    }
    public static int remAnagrams(String s,String s1){
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i <s.length() ; i++) {
            freq1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i <s1.length() ; i++) {
            freq2[s1.charAt(i) - 'a']++;
        }
        int delete = 0;

        for (int i = 0; i < 26; i++) {
            delete += Math.abs(freq1[i] - freq2[i]);
        }
        return delete;
    }
}