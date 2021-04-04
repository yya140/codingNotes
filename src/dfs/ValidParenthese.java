package dfs;

import java.util.ArrayList;
import java.util.List;

public class ValidParenthese {
    public List<String> validParentheses(int n) {
        List<String> result = new ArrayList<String>();
        char[] cur = new char[2*n];
        helper(cur, n, n, 0, result);
        return result;
    }
    //left: how many "(" we still have
    //right: how many ")" we still have
    //index: the current position in cur
    private void helper(char[] cur, int left, int right, int index, List<String> result){
        if (left == 0 && right == 0){
            result.add(new String(cur));
            return;
        }
        if (left > 0){
            cur[index] = '(';
            helper (cur, left-1, right, index+1, result);
        }
        if (right > left){
            cur[index] = ')';
            helper(cur, left, right-1, index+1, result);
        }
    }

    public static void main(String[] arg){
        ValidParenthese obj = new ValidParenthese();
        List<String> result = obj.validParentheses(3);
        System.out.println(result);
    }
}
