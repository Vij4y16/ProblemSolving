public class LookAndSay {
    public static void main(String[] args) {
        int n=3;
        String prev = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();
            char prevDigit = prev.charAt(0);
            int count = 1;
            for (int j = 1; j < prev.length(); j++) {
                char digit = prev.charAt(j);
                if (digit == prevDigit) {
                    count++;
                } else {
                    next.append(count).append(prevDigit);
                    prevDigit = digit;
                    count = 1;
                }
            }
            next.append(count).append(prevDigit);
            prev = next.toString();
        }
//        return prev;
        System.out.println(prev);
    }
}
