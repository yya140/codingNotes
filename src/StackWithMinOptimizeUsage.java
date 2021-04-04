//
//
//
//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.LinkedList;
//
//
//public class StackWithMinOptimizeUsage {
//    private Deque<Integer> s1;
//    private Deque<Pair<Integer, Integer>> minStack;
//
//    public StackWithMinOptimizeUsage(){
//        s1 = new LinkedList<Integer>();
//            minStack = new ArrayDeque();
//    }
//
//    public void push(int element){
//        s1.offerLast(element);
//        if (minStack.isEmpty() || minStack.peekLast().getKey() > element){
//            Pair<Integer,Integer> a = new Pair(element, s1.size());
//            minStack.offerLast(a);
//        }
//    }
//
//    public int pop(){
//        if (s1.isEmpty()){
//            return -1;
//        }
//        int result = s1.pollLast();
//        int globalMin = minStack.peekLast().getKey();
//        if (result == globalMin){
//            minStack.pollLast();
//        }
//        return result;
//    }
//
//    public int top(){
//        if (s1.isEmpty()){
//            return -1;
//        }
//        return s1.peekLast();
//    }
//
//    public int min(){
//        if (minStack.isEmpty()){
//            return -1;
//        }
//        return minStack.peekLast().getKey();
//    }
//
//    public void print(){
//        System.out.println(s1.toString());
//    }
//
//    public static void main (String[] arg){
//        StackWithMinOptimizeUsage in = new StackWithMinOptimizeUsage();
//        in.push(1);
//        in.push(2);
//        in.push(3);
//        in.push(4);
//        in.pop();
//        System.out.println(in.top());
//        System.out.println(in.min());
//        in.push(-2);
//        System.out.println(in.min());
//        in.pop();
//        System.out.println(in.min());
//    }
//
//}
