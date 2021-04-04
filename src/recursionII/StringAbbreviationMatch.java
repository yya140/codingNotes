package recursionII;

import static java.lang.Character.isDigit;

public class StringAbbreviationMatch {
    public boolean match(String input, String pattern) {
        return match(input, pattern, 0,0);
    }

    private boolean match(String s, String t, int si, int ti){
        if (si == s.length() && ti == t.length()){
            return true;
        }
        if (si >= s.length() || ti >= t.length()){
            return false;
        }
        //case 1. if the current character in t is letter
        if (t.charAt(ti) == s.charAt(si)){
           return match(s, t, si+1, ti+1);
        }
        if (isDigit(t.charAt(ti))){
            int total = 0;
            while(ti < t.length() && isDigit(t.charAt(ti))){
                total = total*10+(t.charAt(ti) - '0');
                ti++;
            }
            return match(s,t,si+total,ti);
        }
        return false;
    }
}
