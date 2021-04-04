package heapgraphsearch;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SmallestK {
    public static int[] solution(int[] array, int k) {
        if (array.length == 0 || k == 0) {
            return new int[0];// Write your solution here
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a.equals(b)) {
                    return 0;
                }
                return a > b ? -1 : 1;
            }
        });

        for (int i = 0; i < array.length; i++){
            if (i<k){
                maxHeap.offer(array[i]);
            } else if (array[i] < maxHeap.peek()){
                maxHeap.poll();
                maxHeap.offer(array[i]);
            }
        }
        int [] result = new int[k];
        for (int i=k-1; i >=0 ; i--){
            result[i] = maxHeap.poll();
        }
        return result;
    }

    public static void main(String[] arg) {
        int[] array = new int[]{3, 4, 1, 2, 5};
        int[] result = solution(array, 3);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
