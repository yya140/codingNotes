import java.util.*;
import java.util.LinkedList;

public class SortWith2Stacks {
    public static void sort(LinkedList<Integer> s1) {
        if (s1 == null || s1.size() <= 1){
            return;
        }
        LinkedList<Integer> s2 = new LinkedList<Integer>();
        sort(s1,s2);
    }

    private static void sort(Deque<Integer> input, Deque<Integer> buffer){
        //input: unsorted elements
        //s2: bottom: sorted elements; top: buffer
        //Step 1: sort in ascending order and store result in buffer
        while (!input.isEmpty()){
            int globalMin = Integer.MAX_VALUE;
            int count = 0;
            while (!input.isEmpty()){
                int top = input.pollFirst();
                if (top < globalMin){
                    globalMin = top;
                    count = 1;
                } else if (top == globalMin){
                    count++;
                }
                buffer.offerFirst(top);
            }

            while (!buffer.isEmpty() && buffer.peekFirst() >= globalMin){
                int tmp = buffer.pollFirst();
                if (tmp != globalMin){
                    input.offerFirst(tmp);
                }
            }

            while (count > 0){
                buffer.offerFirst(globalMin);
                count--;
            }
        }

        //Step 2: move result from buffer to input, so that it's in descending order
        while (!buffer.isEmpty()){
            input.offerFirst(buffer.pollFirst());
        }
    }

    public static void main(String[] arg){
         LinkedList<Integer> test = new LinkedList<>();
         test.add(3);
         test.add(1);
         test.add(0);
         test.add(4);
         test.add(6);
         sort(test);
         System.out.println(test.toString());
    }
}
