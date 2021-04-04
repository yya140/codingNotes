package string;

public class ReverseWords {
        public static String reverseWords(String input) {
            if (input == null || input.length() <= 1){
                return input;
            }
            char[] array = input.toCharArray();
            int slow = 0;
            int fast = 0;
            while (fast < array.length){
                if (fast == array.length-1){
                    reverseLetters(array, slow, fast);
                    break;
                } else if (array[fast] != ' '){
                    fast++;
                } else {
                    reverseLetters(array, slow, fast-1);
                    fast++;
                    slow = fast;
                }
            }
            reverseLetters(array,0,array.length-1);
            return new String(array);
        }

        private static void reverseLetters(char[] array, int i, int j){
            while (i < j){
                swap(array, i, j);
                i++;
                j--;
            }
        }

        private static void swap(char[] array, int i, int j){
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }



    public static void main(String[] arg){
        String test = "an apple";
        System.out.println(reverseWords(test));
    }

}
