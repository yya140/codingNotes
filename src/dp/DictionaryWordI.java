package dp;


import java.util.HashSet;
import java.util.Set;

public class DictionaryWordI {
    public boolean canBreak(String input, String[] dict) {
        Set<String> dicSet = toSet(dict);
        boolean[] canBreak = new boolean[input.length()+1];
        canBreak[0] = true;
        for (int i = 1; i < canBreak.length; i++){
            for (int j = 0; j < i; j++){
                boolean canBreakRightSide = dicSet.contains(input.substring(j,i));
                boolean canBreakLeftSide = canBreak[j];
                if (canBreakRightSide && canBreakLeftSide){
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[canBreak.length-1];
    }

    private Set<String> toSet(String[] dict) {
        Set<String> set = new HashSet<>();
        for (String s : dict) {
            set.add(s);
        }
        return set;
    }
}
