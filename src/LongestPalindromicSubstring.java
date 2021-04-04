public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1){
            return "";
        }
        int globleMax = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++){
            int longest = Math.max(expandFromCenter(s, i, i), expandFromCenter(s, i, i+1));
            if (longest > globleMax){
                globleMax = longest;
                if (longest%2 == 0){
                    start = i - (longest/2-1);
                } else {
                    start = i - (longest/2);
                }
                end = i + longest/2;
            }

        }

        return s.substring(start,end+1);
    }

    private int expandFromCenter(String s, int start, int end){
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        return end-start-1;
    }
}
