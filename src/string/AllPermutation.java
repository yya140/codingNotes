//package string;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class AllPermutation {
//    public List<String> permutations(String input) {
//        List<String> result = new ArrayList<>();
//        if (input == null ){
//            return result;
//        }
//        char[] array = input.toCharArray();
//        helper(array, 0, result);
//        return result;
//    }
//
//    private void helper(char[] array, int index, List<String> result){
//        if (index == array.length){
//            result.add(new String(array));
//            return;
//        }
//        Set<Character> used = new HashSet<Character>();
//        for (int i = index; i < array.length; i++){
//            if (used.contains(array[i])){
//                continue;
//            }
//            used.add(array[i]);
//            swap(array,i,index);
//            System.out.println("first swap: + " + print(array));
//            helper(array,index+1,result);
//            swap(array, i, index);
//            System.out.println("second swap: + " + print(array));
//        }
//    }
//
//    private void swap(char[] array, int left, int right){
//        char tmp = array[left];
//        array[left] = array[right];
//        array[right] = tmp;
//    }
//
//    private void print(char[] arr){
//        for(char i : arr){
//            System.out.print(i);
//        }
//    }
//}
