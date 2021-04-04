import java.util.LinkedList;

public class StackWithMin {
    private LinkedList<Integer> s1 = new LinkedList<>();
    private LinkedList<Integer> minStack = new LinkedList<>();

    public StackWithMin(){

    }

    public int pop(){
        if (s1.isEmpty()){
            return -1;
        }
        Integer result = s1.pollLast();
        minStack.pollLast();
        return result;
    }

    public void push(int element){
        s1.offer(element);
        if (minStack.isEmpty() || element <= minStack.peekLast()){
            minStack.offer(element);
        } else if (element > minStack.peekLast()){
            minStack.offer(minStack.peekLast());
        }
    }

    public int top(){
        if (s1.isEmpty()){
            return -1;
        }
        return s1.peekLast();
    }

    public int min(){
        if (minStack.isEmpty()){
            return -1;
        } else{
            return minStack.peekLast();
        }
    }

    public void printStack(){
        System.out.println(s1.toString());
    }

    public static void main(String[] arg){
        StackWithMin in = new StackWithMin();
        in.push(1);
        in.push(2);
        in.printStack();
        System.out.println(in.min());
        in.push(-2);
        System.out.println(in.min());
        System.out.println(in.pop());
        System.out.println(in.min());
    }
}
