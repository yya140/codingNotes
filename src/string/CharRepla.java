package string;

public class CharRepla {
    public static String replaceII(String input, String s, String t){
        StringBuilder sb = new StringBuilder();
        int fromIndex = 0;
        int matchIndex = input.indexOf(s, fromIndex);
        while (matchIndex!=-1){
            sb.append(input, fromIndex, matchIndex).append(t);
            fromIndex = matchIndex + s.length();
            matchIndex = input.indexOf(s, fromIndex);
        }
        sb.append(input, fromIndex, input.length());
        return sb.toString();
    }

    public static void main(String[] arg){
        String test = "student";
        String s = "den";
        String t = "WXYZ";
        System.out.println(replaceII(test, s,t));
    }
}
